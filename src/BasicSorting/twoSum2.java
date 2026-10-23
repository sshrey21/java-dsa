
package BasicSorting;

import java.util.Arrays;

public class twoSum2 {
    public static void main(String[] args) {
        int[] arr = {7, 4, 3, 2, 8, 10};
        int target = 9;

        Arrays.sort(arr);

        int n = arr.length;
        int i = 0;
        int j = n - 1;
        boolean found = false;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println(arr[i] + " " + arr[j]);
                found = true;
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }

        if (!found) {
            System.out.println("No such pair found");
        }
    }
}
