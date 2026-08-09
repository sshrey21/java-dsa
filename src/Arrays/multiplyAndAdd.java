package Arrays;
import java.util.*;
public class multiplyAndAdd {
    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void mulAdd(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i]=arr[i]+10;
            }
            else
            {
                arr[i]=arr[i]*2;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size:-");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        print(arr);
        System.out.println("modified array:-");
        mulAdd(arr);
        print(arr);

    }
}
