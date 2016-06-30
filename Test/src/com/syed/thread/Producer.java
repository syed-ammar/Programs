package com.syed.thread;

import java.util.Queue;

public class Producer implements Runnable{

	Queue<Integer> Q;
	
	public Producer(Queue<Integer> q) {
		super();
		Q = q;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int i = 0;
		/*while(i<5){
			synchronized (Q) {
				if(Q.size() > 5){
					try {
						Q.wait();
						System.out.println("Waiting for Consumer");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					Q.add(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					i++;
					Q.notifyAll();
					System.out.println(i+ "Added by producer");
				}
			}
		}*/
		while(i<5){
			System.out.println(Q.add(i));
			i++;
		}
	}

}
