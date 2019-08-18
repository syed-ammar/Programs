package com.syed.thread;

import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPool
{
    //Thread pool size
    private final int poolSize;
     
    //Internally pool is an array
    private final WorkerThread[] workers;
     
    // FIFO ordering
    private final LinkedBlockingQueue<Runnable> queue;
 
    public CustomThreadPool(int poolSize)
    {
        this.poolSize = poolSize;
        queue = new LinkedBlockingQueue<Runnable>();
        workers = new WorkerThread[poolSize];
 
        for (int i = 0; i < poolSize; i++) {
            workers[i] = new WorkerThread();
            workers[i].start();
        }
    }
 
    public void execute(Runnable task) {
        synchronized (queue) {
            queue.add(task);
            queue.notify();
        }
    }
 
    private class WorkerThread extends Thread {
        public void run() {
            Runnable task;
            //System.out.println("Task before : "+task);
            while (true) {
                synchronized (queue) { 
                	/*Using "while" instead of "if" is like a double check to prevent exceptions. For example, if two threads
                	 * are waiting on the queue, say both get notified on the addition of an element, both try to poll on the Q
                	 * One of them will get it and the other will throw NullPointerException */
                	
                    while (queue.isEmpty()) {
                        try {
                        	System.out.println("Before Waiting for task : "+Thread.currentThread().getName());
                            queue.wait();
                            System.out.println("After Waiting for task : "+Thread.currentThread().getName());
                        } catch (InterruptedException e) {
                            System.out.println("An error occurred while queue is waiting: " + e.getMessage());
                        }
                    }
                    task = queue.poll();
                    try {
                    	//System.out.println("Task after : "+task);
                        task.run();
                    } catch (RuntimeException e) {
                        System.out.println("Thread pool is interrupted due to an issue: " + e.getMessage());
                    }
                }
            }
        }
    }
 
    public void shutdown() {
        System.out.println("Shutting down thread pool");
        for (int i = 0; i < poolSize; i++) {
            workers[i] = null;
        }
    }
}