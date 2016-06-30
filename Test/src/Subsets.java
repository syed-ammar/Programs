
public class Subsets {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		
		int noOfSubsets = 1<<a.length;
		
		for(int i = 0 ; i < noOfSubsets ; i++){
			
			int pos = a.length - 1;
			
			int bitMask = i;
			
			System.out.print("{");
			
			while(bitMask > 0){
				
				if((bitMask & 1) == 1){
					
					System.out.print(a[pos]+",");
					
				}
				
				bitMask >>=1;
				
				pos--;
			}
			
			System.out.println("}");
		}

	}

}
