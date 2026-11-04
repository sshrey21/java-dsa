
package Searching;

public class searchInRotatedSorted {

    public static int search(int[] arr, int key) {

        int n = arr.length;

        // Step 1: Find pivot (index of minimum element)
        int low = 0, high = n - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high])
                low = mid + 1;
            else
                high = mid;
        }

        int pivot = low;

        // Step 2: Determine the sorted portion
        if (key >= arr[pivot] && key <= arr[n - 1]) {

            // Search in right sorted portion
            low = pivot;
            high = n - 1;

        } else {

            // Search in left sorted portion
            low = 0;
            high = pivot - 1;
        }

        // Step 3: Normal Binary Search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;

            else if (arr[mid] > key)
                high = mid - 1;

            else
                low = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3, 4};

        int key = 7;

        int index = search(arr, key);

        System.out.println(index);
    }
}
