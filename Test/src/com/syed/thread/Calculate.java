package com.syed.thread;

public class Calculate {

	public class Reader implements Runnable{

		Calculator calc;
		public Reader(Calculator calc) {
			this.calc = calc;
		}
		@Override
		public void run() {
			if(calc.total == 0) {
				synchronized (calc) {
					try {
						System.out.println("I am waiting "+Thread.currentThread());
						calc.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		}
		System.out.println("total for thread ="+Thread.currentThread()+ " : "+calc.total);

	}

}
public static void main(String[] args) throws InterruptedException {
	Calculator calc = new Calculator();
	Calculator calc2 = new Calculator();
	Reader reader = new Calculate().new Reader(calc);
	Reader reader2 = new Calculate().new Reader(calc);
	Thread t1 = new Thread(reader);
	Thread t2 = new Thread(reader);
	Thread t3 = new Thread(reader2);
	Thread t4 = new Thread(calc);
	
	//Run the theads in sequence
	t4.start();
	t4.join();
	t1.start(); //Run after t4 is complete
 	t1.join();
	t2.start();//Run after t1 is complete
	t2.join();
	t3.start();//Run after t2 is complete
	t3.join();
	
	//Run in random after
	
   /* t1.start();
	t2.start();
	t3.start();
	t4.start();
	*/
	
	
}	

}
