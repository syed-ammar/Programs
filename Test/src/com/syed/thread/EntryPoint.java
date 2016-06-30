package com.syed.thread;

import java.util.LinkedList;
import java.util.Queue;

public class EntryPoint {

	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<Integer>();

		Producer prod = new Producer(Q);
		Consumer con = new Consumer(Q);
		
		Thread t1 = new Thread(prod);
		Thread t2 = new Thread(con);
		
		t1.start();
		t2.start();
	}

}
