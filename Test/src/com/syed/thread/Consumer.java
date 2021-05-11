package com.syed.thread;

import java.util.Queue;

public class Consumer implements Runnable{

	private final Queue<Integer> Q;

	public Consumer(Queue<Integer> q) {
		super();
		Q = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized (Q) {
				while(Q.isEmpty()){
					try {
						System.out.println("Waiting for Producer");
						Q.wait();

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				Q.poll();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				Q.notifyAll();
				System.out.println("Consumed by consumer");

			}
		}

		/*int i = 0;
		while(i<5){
			System.out.println("Consumer + "+Q.poll());
			i++;
		}*/

	}

}
