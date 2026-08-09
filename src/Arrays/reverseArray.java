package Arrays;
import java.util.*;
public class reverseArray {
   static Scanner sc=new Scanner(System.in);
    public static void fill(int[] arr) {
        System.out.println("Enter elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
    }

    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Size:-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        fill(arr);
        System.out.println("The array is:-");
        print(arr);
        int i=0;
        int j=n-1;
        int temp;
        while(i<j)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        print(arr);
    }
}
