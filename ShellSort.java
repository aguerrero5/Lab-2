import java.util.Arrays;
public class ShellSort{
	static int size = 10;
	public static void main(String [] args){
		int [] a = {2,5,3,1,8,7,8,9,10,0};
		
		System.out.println("Iterative");
		shellSort(a);
		for (int i = 0; i < size; i ++ ){
		System.out.print(a[i] + " ");
		}
		
		/*System.out.println("\n" + "Recursive");
        System.out.println(Arrays.toString(recursiveInsertionSort(a, 1)));*/
	}
public static void shellSort(int[] a) {
		for (int gap = a.length / 2; gap >= 1; gap = gap / 2) {
			// insertion sort on every gap'th element
			for (int i = gap; i < a.length; i++) {
				int temp = a[i];
				int j = i;
				while (j >= gap && a[j - gap] > temp) {
					a[j] = a[j - gap];
					j -= gap;
				}
				a[j] = temp;
			}
		}
	}
}