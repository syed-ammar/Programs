/**
 * 
 */
package com.syed.thread;

/**
 * @author sammar
 *
 */
public class Calculator implements Runnable{
	
	int total = 0;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<100;i++) {
				total +=i;
			}
			notifyAll();
		}	
		
		
	}

}
