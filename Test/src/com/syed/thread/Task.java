/**
 * 
 */
package com.syed.thread;

import java.util.Date;

/**
 * @author sammar
 *
 */
public class Task implements Runnable{

	private final String name;
	 
    public Task(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        System.out.println("Executing : " + name + ", Current Seconds : " + new Date().getSeconds()+" "+Thread.currentThread().getName());
    }
}
