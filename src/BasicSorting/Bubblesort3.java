package BasicSorting;
/* one more way is there to make best case O(n). It is by checking number of swaps.
If swaps happen then it is unsorted and if not then there is no need to go further.
 */
public class Bubblesort3 {
    public static void print(int[] arr) {
        for(int ele : arr)
            System.out.print(ele+ " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1, 4, 10, 12, 3, 0, 9, -9, 10, 2, 4};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n - 1; i++) {
            int swap = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0) break;
        }
        print(arr);
    }
}
