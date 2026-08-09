package Arrays;
import java.util.*;
public class MergeTwoSortedArrays {
    static Scanner sc = new Scanner(System.in);

    public static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int[] arr1, int[] arr2) {
        int[] ans=new int[arr1.length+arr2.length];
        int k=0,i=0,j=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<=arr2[j])
            {
                ans[k]=arr1[i];
                i++;
                k++;
            }
            else if(arr2[j]<arr1[i])
            {
                ans[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(j<arr2.length)
        {
            ans[k]=arr2[j];
            j++;
            k++;
        }
        else {
            ans[k]=arr1[i];
            i++;
            k++;
        }
        print(ans);
    }


    public static void main(String[] args) {
        System.out.println("Enter size of first array");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter size of second array");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements in first array:-");
        fill(arr1);
        System.out.println("First array is:-");
        print(arr1);
        System.out.println("Enter elements in second array");
        fill(arr2);
        System.out.println("Second array is:-");
        print(arr2);
        merge(arr1, arr2);
    }
}

