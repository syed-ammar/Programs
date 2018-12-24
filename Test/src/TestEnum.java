import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;


public class TestEnum {

	static int i;
	static {
		System.out.println("hello");
		 i = 10;
		// System.out.println(i);
		 //System.exit(0);
	}
	public static void main(String[] args) throws InterruptedException, NoSuchFieldException, SecurityException {
		
		//System.out.println(CoffeeSize.HUGE.getOunces());
		
		//Map<String,String> premiumPhone = new HashMap<String,String>();
		Map<String,String> premiumPhone = new ConcurrentHashMap<String,String>();
        premiumPhone.put("Apple", "iPhone");
        premiumPhone.put("HTC", "HTC one");
        premiumPhone.put("Samsung","S5");
		//List<Node> list = (List<Node>) map.values();
		
		//Collection<Node> listC = map.values();
        
        
        String.valueOf(10);
        Class emp = Employee.class;
        Field empId = emp.getDeclaredField("empId");
       
        Iterator it = premiumPhone.entrySet().iterator();
        
        while(it.hasNext()){
        	@SuppressWarnings("unchecked")
			Map.Entry<String, String> entry = (Entry<String, String>) it.next();
        	System.out.println(entry);
        	if(entry.getKey().equalsIgnoreCase("Apple")){
        		it.remove();
        		
        	}
        	premiumPhone.put("Nokia", "Lumia");
        }
        
        System.out.println("-----------------------------------------------------");
        Iterator it1 = premiumPhone.entrySet().iterator();
        while(it1.hasNext()){
        	Entry<String, String> entry = (Entry<String, String>) it1.next();
        	System.out.println(entry);
        }
        
        
        Thread t1 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0 ;i<5;i++){
					System.out.println("I am thread 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
        
        Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i = 0 ;i<5;i++){
					System.out.println("I am thread 2");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
        
        
        t1.start();
        t1.join();
        t2.start();
        
        
		System.out.println(i);
	}

}
