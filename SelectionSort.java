import java.util.Arrays;
public class SelectiveSort{
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
	public static int[] selectionSort(int array[]){

	for(int i = array.length - 1; i >= 0; i--)		// start at the end of the array
	{
		int highestIndex = i;				// (1) default value of the highest element index.
		for(int j = i; j >= 0; j--)			// (2) loop from the end of unsorted zone to the
								//  beginning of the array.
		{
			if(array[j] > array[highestIndex])	// compare current element to highest
				highestIndex = j;		// if it's higher, it becomes the new highest
		}
		// swap the two values
		int temp = array[i];
		array[i] = array[highestIndex];
		array[highestIndex] = temp;
	}
	return array;
}
	public static int[] recursiveSelectionSort(int[] list, int n) {
        if (n == list.length - 1) {
            return list;
        }
        int temp;
		size = n;
        for (int i = n + 1; i < list.length; i++) {
            if (list[i] < list[size]) {
                size = i;
            }
        }
        temp = list[n];
        list[n] = list[size];
        list[size] = temp;
        return recursiveSelectionSort(list, n+1);
    }
}