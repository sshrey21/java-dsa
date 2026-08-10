package Arrays;
import java.util.*;
public class ChatGPT {
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

    public static void removeThree(int[] arr)
    {
        int j=0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=3) {
                arr[j] = arr[i];
                j++;
            }
        }
        System.out.println("j is:"+ j );
    }
    public static void main(String[] args) {
        System.out.println("Enter size of the array:-");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements");
        fill(arr);
        System.out.println("Array is:-");
        print(arr);
        removeThree(arr);
    }
}
