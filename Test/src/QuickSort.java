
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {22,2,3,10,4};
		System.out.println("Before Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
		
		quickSort(a, 0, a.length-1);
		
		System.out.println();
		System.out.println("After Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
	}

	public static void quickSort(int[] a, int left, int right){
		int s;
		if(left < right){
			
			s = partition(a,left,right);
			quickSort(a, left, s-1);
			quickSort(a, s+1, right);
			
		}
	}
	
	public static int partition(int[] a, int left, int right){
		int pivot = a[left];
		int temp;
		
		while(left < right){
			
			while(a[left] < pivot){
				left++;
			}
			
			while(a[right] > pivot){
				right--;
			}
			
			if(left < right){
				temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}
		}
		
		if(left >= right){
			temp = a[right];
			a[right] = pivot;
			pivot = temp;
		}
		
		
		return right;
		
	}
}
