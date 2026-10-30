package Searching;
import java.util.*;
public class negPosCountSortedArray {
    public static int maxOfNCountPCount(int[] nums, int n) {
        int low=0, high=n-1, countN=0,countP=0, idx = -1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]<0)
            {
                idx = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        countN=idx+1;
        low=0;
        high=n-1;
        idx=-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid]<=0)
                low = mid+1;
            else
            {
                idx=mid;
                high = mid-1;
            }
        }
        countP=(idx == -1)?0:n-idx;
        return(Math.max(countN, countP));

    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("N= ");
        int N = sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter elements in increasing order: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int max = maxOfNCountPCount(arr, N);
        System.out.println(max);

    }
}
