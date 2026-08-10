package BasicSorting;
/*earlier in bubble sort, code will keep on running even if the arrays gets sorted in first pass only
like [1,2,3,4,5], here even if it is sorted even then the traversal will take place.
Therefore, the idea is to check before each pass whether the array is sorted or not
 */
public class BubbleSort2 {
    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, 4, 10, 12, 3, 0, 9, -9, 10, 2, 4};
        int n = arr.length;
        print(arr);
        for (int i = 0; i <= n - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted == true) break;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
