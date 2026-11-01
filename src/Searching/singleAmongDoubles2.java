package Searching;

public class singleAmongDoubles2 {
    public static int single(int[] arr) {
        int n = arr.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is the single element
            if ((mid == 0 || arr[mid] != arr[mid - 1]) &&
                    (mid == n - 1 || arr[mid] != arr[mid + 1])) {
                return arr[mid];
            }

            // Current element matches its left neighbour
            if (mid > 0 && arr[mid] == arr[mid - 1]) {
                if ((mid - 1) % 2 == 0) {
                    // Pair starts at an even index
                    low = mid + 1;
                } else {
                    // Pair starts at an odd index
                    high = mid - 2;
                }
            }

            // Current element matches its right neighbour
            else if (mid < n - 1 && arr[mid] == arr[mid + 1]) {
                if (mid % 2 == 0) {
                    // Pair starts at an even index
                    low = mid + 2;
                } else {
                    // Pair starts at an odd index
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 8, 8, 9, 9};
        int num = single(arr);
        System.out.println(num);
    }
}