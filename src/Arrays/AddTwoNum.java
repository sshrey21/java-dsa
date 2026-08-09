package Arrays;
import java.util.*;
public class AddTwoNum {
    static Scanner sc=new Scanner(System.in);
    public static void fill(int[] arr) {
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

    public static void addTwoNums(int[] arr1, int[] arr2)
    {
        ArrayList <Integer> ans=new ArrayList<>();
        int i=arr1.length-1;
        int j=arr2.length-1;
        int c=0,sum=0;
        while(i>=0 || j>=0 || c!=0)
        {
            sum=c;
            if(i>=0)
            {
                sum+=arr1[i];
                i--;
            }
            if(j>=0)
            {
                sum+=arr2[j];
                j--;
            }
            ans.add(sum%10);
            c = sum/10;
        }
        Collections.reverse(ans);
        System.out.println("Sum array:-");
        System.out.println(ans);
    }
    public static void main(String[] args) {
        System.out.println("Enter size of first array");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter size of second array");
        int n2=sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements in first array:-");
        fill(arr1);
        System.out.println("First array is:-");
        print(arr1);
        System.out.println("Enter elements in second array");
        fill(arr2);
        System.out.println("Second array is:-");
        print(arr2);
        addTwoNums(arr1, arr2);
    }

}
