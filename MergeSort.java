import java.util.Arrays;
public class MergeSort{
	static int size = 10;
	public static void main(String [] args){
		int [] a = {2,5,3,1,8,7,8,9,10,0};
		
		System.out.println("Iterative");
		mergeSort(a);
		for (int i = 0; i < size; i ++ ){
		System.out.print(a[i] + " ");
		}
		
		System.out.println("\n" + "Recursive");
		
         recMergeSort(a, 0, size);
        /* Print sorted Array */       
        for (int i = 0; i < size; i++)
            System.out.print(a[i]+" ");            
        System.out.println();            
	}
public static void mergeSort(int[] a) {
		if (a.length >= 2) {
			// split array in half
			int[] left  = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			
			// sort the halves
			mergeSort(left);
			mergeSort(right);
			
			// merge them back together
			int i1 = 0;
			int i2 = 0;
			for (int i = 0; i < a.length; i++) {
				if (i2 >= right.length ||
						(i1 < left.length && left[i1] < right[i2])) {
					a[i] = left[i1];
					i1++;
				} else {
					a[i] = right[i2];
					i2++;
				}
			}
		}
	}
	public static void recMergeSort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        recMergeSort(a, low, mid); 
        recMergeSort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }

}