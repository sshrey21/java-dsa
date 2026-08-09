package Arrays;
import java.util.*;
public class DuplicateElement2 {
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
    public static void duplicate(int[] arr)
    {
        int n=arr.length;
        boolean[] flag=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(flag[arr[i]]==true)
            {
                System.out.println("Duplicate is: "+arr[i]);
            }
            else
            {
                flag[arr[i]]=true;
            }
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter size of the array:-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        fill(arr);
        System.out.println("Array is:-");
        print(arr);
        System.out.println("The duplicate element is:-");
        duplicate(arr);

    }

}
