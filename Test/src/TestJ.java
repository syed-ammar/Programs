import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;



class MyException extends Exception{
	
}

class Tire{
	void doStuff(){}
}
public class TestJ extends Tire implements TestInterace1,TestInterface2{

	/**
	 * @param args
	 * @throws IOException 
	 */
	private static int no_of_chefs = 0;
	private static int targetChef = 0;
	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";
		String s3 = new String("Hello");
		StringBuffer sb1 = new StringBuffer("hi");
		StringBuffer sb2 = new StringBuffer("hi");
		Integer a[] = {2,3};
		
		new ArrayList<>().iterator();
		System.out.println(s.substring(1));
		String st = "String:/syed:Ammar";
		
		StringTokenizer token = new StringTokenizer(st, ":/");
		
		int count = 0;
		System.out.println(count++);
		
		while(token.hasMoreElements()){
			System.out.println(token.nextElement());
		}
		
		
		 int sum = 0;
         for (int i = 0, j = 0; i < 5 & j < 5; ++i, j = i + 1)
             sum += i;
	     System.out.println(sum);
	     
	     Map<String,Object> map = new HashMap<String,Object>();
	     map.keySet();
		/*
		
		Integer i1 = 1000;
		Integer i2 = 1000;
		
		if(i1 != i2){
			System.out.println("Equal");
		}
		//new TestJ().doStuff();
		short s = 0;
		int x = 10;
		int y = 20;
		int z = 134556;
		s+=z;
		
		System.out.println(""+x+y+s);
		
		
		Map<String,String> map = new HashMap<String,String>();
		Iterator iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()){
			@SuppressWarnings("unchecked")
			Map.Entry<String, String> entry = (Entry<String, String>) iterator.next();
			String key = entry.getKey();
			String value = entry.getValue();
		}
		
		
		// TODO Auto-generated method stub
			//String s = "Hello world";
			File file = new File("Hello.txt");
			FileOutputStream fp = new FileOutputStream(file);
			//fp.write(s.getBytes());
		
			Scanner scanInput = new Scanner(System.in);
			no_of_chefs = scanInput.nextInt();
			targetChef = scanInput.nextInt();
			int trust[] = new int[no_of_chefs];
			
			for(int i=0 ;i<no_of_chefs ;i++){
				trust[i] = scanInput.nextInt();
			}
			
			int Q = scanInput.nextInt();
			scanInput.close();
			System.out.println(s);
		Map<Character,Integer> stCount = new HashMap<Character,Integer>();
		String s = "Hello World";
		//String[] a = s.split(" ");
		//System.out.println(a[0]);
		for(int i =0 ; i<s.length();i++){
			if(stCount.containsKey(s.charAt(i))){
				int temp = stCount.get(s.charAt(i))+1;
				stCount.put(s.charAt(i),temp);
			}else{
				stCount.put(s.charAt(i), 1);
			}
			
		}
		for(Entry<Character, Integer> s1 : stCount.entrySet()){
			System.out.println(s1.getKey()+" "+s1.getValue());
		}
		
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee();
		emp1.setEmpAge(21);
		emp1.setEmpId(111);
		emp1.setEmpName("Syed");
		empList.add(emp1);
		
		Employee emp2 = new Employee();
		emp2.setEmpAge(21);
		emp2.setEmpId(112);
		emp2.setEmpName("Viv");
		empList.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setEmpAge(29);
		emp3.setEmpId(113);
		emp3.setEmpName("Vai");
		empList.add(emp3);
		for(Employee e : empList){
			System.out.println(e.getEmpName()+""+e.getEmpId()+""+e.getEmpAge());
		}
		
		System.out.println(empList.get(0).getEmpAge());
		
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee arg0, Employee arg1) {

				int i = arg0.getEmpAge() - arg1.getEmpAge();
				if(i!=0){
					return i;
				}
				
				if(!arg0.getEmpName().equals(arg1.getEmpName())){
					return -1;
				}
				
				return arg0.getEmpId() - arg1.getEmpId();
				
				
			}
		});
		
		
		for(Employee e : empList){
			System.out.println(e.getEmpName()+""+e.getEmpId()+""+e.getEmpAge());
		}
	*/}

	void doStuff() throws ArithmeticException{
		System.out.println(7/0);
	}
	@Override
	public void testMethodOfInterface() {
		// TODO Auto-generated method stub
		
	}

}
