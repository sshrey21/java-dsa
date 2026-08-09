package Arrays;
import java.util.*;
public class Segregate0and1 {
    static Scanner sc=new Scanner(System.in);
    public static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    public static void print(int[] arr) {
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }

    public static void fill(int[] arr) {
        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

    }
    public static void main(String[] args) {
        System.out.println("Enter size:-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        fill(arr);
        System.out.println("Original array:-");
        print(arr);
        int i=0, j=arr.length-1;
        while(i<j)
        {
            if(arr[i]== 0) i++;
            else if(arr[j]==1) j--;
            else swap(arr,i, j);
        }
        System.out.println("Array after segregation:-");
        print(arr);
    }
}
