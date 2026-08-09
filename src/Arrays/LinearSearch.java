package Arrays;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Fill elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target");
        int target=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==target)
            {
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("Target exists in array");
        else
            System.out.println("Target doesnt exists");
    }
}
