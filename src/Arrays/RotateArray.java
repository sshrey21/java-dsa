package Arrays;
import java.util.*;
public class RotateArray {
    static Scanner sc=new Scanner(System.in);
        public static void fill(int[] arr) {
            System.out.println("Enter elements");
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
        }

        public static void print(int[] arr) {
            for(int ele : arr)
            {
                System.out.print(ele+" ");
            }
        }

    public static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        System.out.println("Size:-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        fill(arr);
        System.out.println("The array is:-");
        print(arr);
        System.out.println("Enter rotation number:-");
        int d=sc.nextInt();
        reverse(arr, 0, n-1);
        reverse(arr, 0, d);
        reverse(arr, d+1, n-1);
        print(arr);
    }
}
