 import java.util.Arrays;
public class RadixSort{
	static int size = 10;
	public static void main(String [] args){
		int [] a = {2,5,3,1,8,7,8,9,10,0};
		
		System.out.println("Iterative");
		radixSort(a);
		for (int i = 0; i < size; i ++ ){
		System.out.print(a[i] + " ");
		}
		
		/*System.out.println("\n" + "Recursive");
        System.out.println(Arrays.toString(recursiveInsertionSort(a, 1)));*/
	}
 public static void radixSort( int[] a){
        int i;
		int m = a[0];
		int exp = 1;
		int n = a.length;
        int[] b = new int[10];
        for (i = 1; i < n; i++)
            if (a[i] > m)
                m = a[i];
        while (m / exp > 0)
        {
            int[] bucket = new int[10];
 
            for (i = 0; i < n; i++)
                bucket[(a[i] / exp) % 10]++;
            for (i = 1; i < 10; i++)
                bucket[i] += bucket[i - 1];
            for (i = n - 1; i >= 0; i--)
                b[--bucket[(a[i] / exp) % 10]] = a[i];
            for (i = 0; i < n; i++)
                a[i] = b[i];
            exp *= 10;        
        }
    } 
}	