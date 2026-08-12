package BasicSorting;

public class UniqueFrontDuplicateRear {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 7};
        int j = 1;
        for (int i = 2; i < arr.length; i++) {
            // New unique element found
            if (arr[i] != arr[j - 1]) {
                int temp = arr[i];
                // Shift elements one position to the right
                for (int k = i; k > j; k--) {
                    arr[k] = arr[k - 1];
                }
                // Put new unique element at j
                arr[j] = temp;
                j++;
            }
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

