
public class Subsets {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,4};
		
		//Method 1 :
		/*int noOfSubsets = 1<<a.length;
		
		System.out.println("Lenght : "+a.length);
		System.out.println("No of subsets : "+noOfSubsets);
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
		}*/
		
		 int n = a.length;
		 
	        // Run a loop for printing all 2^n
	        // subsets one by one
	        for (int i = 0; i < (1<<n); i++)
	        {
	            System.out.print("{ ");
	 
	            // Print current subset
	            for (int j = 0; j < n; j++) {
	 
	                // (1<<j) is a number with jth bit 1
	                // so when we 'AND' them with the
	                // subset number we get which numbers
	                // are present in the subset and which
	                // are not
	            	int bitMask = 1<<j;
	                if ((i & bitMask) > 0)
	                    System.out.print(a[j] + " ");
	            }
	 
	            System.out.println("}");
	        }

	}

}
