
public class TestFib {

	public static void main(String[] args) {
		int num1 = 0,num2 = 1,sumOfNumbers= 0;
		int temp;
		
		for(;;){
			temp = num1+num2;
			num1 = num2;
			num2 = temp;
			if(temp > 4000000){
				break;
			}else if(temp%2 == 0){
				
				sumOfNumbers += temp;
			  // System.out.println("Sum is "+sumOfNumbers);
			}
		}
		System.out.println("Final sum is "+sumOfNumbers);
		
	}

}
