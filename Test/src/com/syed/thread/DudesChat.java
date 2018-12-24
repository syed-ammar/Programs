package com.syed.thread;

class Dudes{
	private Long flag = new Long(0);
	
	void chat(Long id){
		if(flag == 0){
			flag = id;	
		}
		System.out.println("Flag : "+flag);
		for(int x = 1; x<3 ;x++){
			if(flag == id){
				System.out.println("Yo");
			}else{
				System.out.println("dude");
			}
		}
	}
}
public class DudesChat implements Runnable{

	static Dudes d;
	
	public static void main(String[] args) {
		new DudesChat().go();
	}
	
	void go(){
		//Long temp = new Long(12);
		d = new Dudes();
		DudesChat dc = new DudesChat();
		new Thread(dc).start();
		new Thread(dc).start();
	}

	@Override
	public void run() {
		//Long temp = new Long(10);
		d.chat(Thread.currentThread().getId());
		
	}

}
