
public class BinarySearch {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		
		int index = binarySearch(a, 1, 0, a.length-1);
		
		System.out.println("Element found at position "+index);

	}

	public static int binarySearch(int[] a, int elem, int low, int high){
		
		int mid = (low + high)/2;
		
		if(high < low){
			return -1;
		}
		
		if(a[mid] == elem){
			
			return mid;
			
		}else if(elem < a[mid]){
			
			return binarySearch(a, elem, low, mid-1);
			
		}else{
			
			return binarySearch(a, elem, mid+1, high);
		}
		
	}
}
