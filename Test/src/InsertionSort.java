
public class InsertionSort {

	public static void main(String[] args) {
		int a[] = {22,2,3,10,-4};
		System.out.println("Before Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
		
		insertionSort(a);
		
		System.out.println();
		System.out.println("After Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
	}
	
	public static void insertionSort(int a[]){
		
		int key = 0;
		int i = 0;
		
		for( int j = 1 ; j<a.length ; j++){
			key = a[j];
			i = j-1;
			
			while( i>=0 && a[i] > key){
				
				a[i+1] = a[i];
				i--;
			}
			
			a[i+1] = key;
		}
	}
	
}


