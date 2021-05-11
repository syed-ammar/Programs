import java.util.Arrays;


public class MergeSort {

	public static void main(String[] args) {
		
		int[] a = {22,2,3,10,4};
		System.out.println("Before Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
		
		mergeSort(a);
		
		System.out.println();
		System.out.println("After Sorting");
		
		for(int i = 0; i<a.length ;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
	}
	
	public static void mergeSort(int[] a){
		int size = a.length;
		int[] c,d;
		if(size > 1){
			c = Arrays.copyOfRange(a, 0, (size/2));
			d = Arrays.copyOfRange(a, size/2, size);
			mergeSort(c);
			mergeSort(d);
			merge(c,d,a);
		}
	}
	
	public static void merge(int[] c, int[] d, int[] a){
		int i = 0,j = 0,k = 0;
		
	
		while(i < c.length && j < d.length){
			
			if(c[i] < d[j]){
				
				a[k] = c[i];
				i++;
				
			}else{
				
				a[k] = d[j];
				j++;
			}
			
			k++;
		}
		
		if(i == c.length){
			copy(a,d,j,k);
		}else{
			copy(a,c,i,k);
		}
	}

	public static void copy(int[] to, int[] from, int fromIndex, int mainIndex){
		
		for(int i =fromIndex ;i < from.length; i++){
			to[mainIndex++] = from[i];
		}
	}
}
