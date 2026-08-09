package Arrays;
import java.util.*;
public class MoveAllZeroes {
    static Scanner sc=new Scanner(System.in);
    public static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted arrya:-");
        print(arr);
    }

    public static void main(String[] args) {
        System.out.println("Enter size of the array:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        fill(arr);
        System.out.println("Array is:-");
        print(arr);
        bubbleSort(arr);
    }
}
