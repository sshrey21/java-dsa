package BasicSorting;
import java.util.*;
public class unionOf2SortedArrays {
    public static void print(ArrayList<Integer> arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9};
        int[] b = {1, 1, 1, 3, 4, 5, 6, 7, 8, 9, 9, 9};
        ArrayList<Integer> ans = new ArrayList<>();
        int na = a.length;
        int nb = b.length;
        int i = 0, j = 0;
        while (i < na && j < nb) {
            int val;
            if (a[i] == b[j]) {
                val = a[i];
                i++;
                j++;
            } else if (a[i] < b[j]) {
                val = a[i];
                i++;
            } else {
                val = b[j];
                j++;
            }
            if (ans.isEmpty() || ans.get(ans.size() - 1) != val) {
                ans.add(val);
            }
        }
        while (i < na) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }
        while (j < nb) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }
        print(ans);
    }
}
