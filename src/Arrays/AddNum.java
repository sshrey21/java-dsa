package Arrays;
import java.util.*;
public class AddNum {
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
    public static void addTwoNums(int[] arr1, int[] arr2) {
        ArrayList <Integer> ans=new ArrayList<>();
        int n1=arr1.length;
        int n2=arr2.length;
        int min=Math.max(n1, n2);
        int c=0;
        for(int i=min-1; i>=0;i--)
        {
            if(arr1[i]+arr2[i]<=9)
            {
                ans.add(arr1[i]+arr2[i]+c);
                c=0;
            }
            else {
                ans.add((arr1[i]+arr2[i]+c)-10);
                c=1;
            }
        }
        if(c==1)ans.add(1);
        Collections.reverse(ans);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        System.out.println("Enter size of first array");
        int n1=sc.nextInt();
        System.out.println("Enter size of second array");
        int n2=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
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
