import java.util.Arrays;
public class Insertion sort{
	static int size = 10;
	public static void main(String [] args){
		int [] a = {2,5,3,1,8,7,8,9,10,0};
		
		System.out.println("Iterative");
		selectionSort(a);
		for (int i = 0; i < size; i ++ ){
		System.out.print(a[i] + " ");
		}
		
		System.out.println("\n" + "Recursive");
        System.out.println(Arrays.toString(recursiveSelectionSort(a, 0)));
	}
void insertionSort(int[] arr) {
      int i, j, newValue;
      for (i = 1; i < arr.length; i++) {
            newValue = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > newValue) {
                  arr[j] = arr[j - 1];
                  j--;
            }
            arr[j] = newValue;
      }
}
}