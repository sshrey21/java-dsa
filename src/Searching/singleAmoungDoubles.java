package Searching;

public class singleAmoungDoubles {
    public static int single(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            } else {
                high = mid;
            }
        }
        return arr[low];
    }
    public static void main(String[] args) {
        int[] arr={0,0,1,1,2,2,4,5,5,6,6,7,7,8,8,9,9,10,10};
        int num = single(arr);
        System.out.println(num);
    }
}
