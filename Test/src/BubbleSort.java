/**
 * 
 */

/**
 * @author SYA
 *
 */
public class BubbleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a[] = {22,2,3,10,-4};
		System.out.println("Before Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
		
		bubbleSort(a);
		
		System.out.println();
		System.out.println("After Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}

	}
	
	public static void bubbleSort(int[] a){
		int len = a.length;
		
		for(int i = 1 ; i <= len ; i++){
			
			for(int j = 0 ; j<len - i ;j++){
				
				if(a[j] > a[j+1]){
					
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
	

}
