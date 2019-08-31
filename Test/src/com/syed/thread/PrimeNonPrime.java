package com.syed.thread;

import java.util.PriorityQueue;
import java.util.Queue;

public class PrimeNonPrime {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> primeQueue = new PriorityQueue<Integer>();
        Queue<Integer> nonPrimeQueue = new PriorityQueue<Integer>();

        Runnable printPrime = () -> {
            while(true){
                if(primeQueue != null && primeQueue.size() > 0){
                    System.out.println("Prime : "+ primeQueue.poll());
                }
            }
        };

        Runnable printNonPrime = () -> {
            while(true){
                if(nonPrimeQueue != null && nonPrimeQueue.size() > 0){
                    System.out.println("Non prime : "+ nonPrimeQueue.poll());
                } else{
                    //System.out.println("Waiting..");
                }
            }
        };

        boolean flag = false;
        for (int i = 2;i<10;i++){
            for(int j=2;j<i/2;j++){
                if(i%j == 0){
                    flag = true;
                    break;
                }
            }
            if(flag){
                nonPrimeQueue.add(i);
                flag = false;
            } else {
                primeQueue.add(i);
            }
        }

        Thread t1 = new Thread(printPrime);
        Thread t2 = new Thread(printNonPrime);
        t1.start();
        t1.join();
        t2.start();

    }
}
