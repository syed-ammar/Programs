/**
 * 
 */

/**
 * @author SYA
 *
 */
public class SelectionSort {

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
		
		selectionSort(a);
		
		System.out.println();
		System.out.println("After Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}

	}
	
	public static void selectionSort(int[] a){
		
		int temp;
		int small;
		
		for(int i = 0; i<a.length ;i++){
			
			small = i;
			
			for(int j = i+1 ; j<a.length ;j++){
			
				if(a[j] < a[small]){
					
					small = j;
				}
			}
			
			if(a[small] != a[i]){
				
				
				temp = a[i];
				a[i] = a[small];
				a[small] = temp;
			}
		}
	}

}
