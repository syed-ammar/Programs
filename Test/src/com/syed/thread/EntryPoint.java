package com.syed.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class EntryPoint {

	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<Integer>();

		Producer prod = new Producer(Q);
		Consumer con = new Consumer(Q);
		
		ThreadPoolExecutor ex= (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		/*Thread t1 = new Thread(prod);
		Thread t2 = new Thread(con);
		
		t1.start();
		t2.start();*/
		ex.execute(prod);
		ex.execute(con);
		ex.shutdown();
		
	}

}
