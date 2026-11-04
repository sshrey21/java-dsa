package Searching;

public class SeachInSortedArray {
    public static int search(int[] arr, int key) {
        int n=arr.length, low=0, high=n-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]==key)return mid;
            else if(arr[low]<=arr[mid])//checking if left part is sorted
            {
                if(arr[low]<=key && key<arr[mid])//checking if key comes in sorted range
                {
                    high = mid-1;
                }
                else low = mid+1;
            }
            else //if right part is sorted
            {
                if(arr[mid]<key && key<=arr[high])
                    {
                        low = mid+1;
                    }
                else high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,10,0,1,2,3,4};
        int key = 21;
        int index = search(arr, key);
        System.out.println(index);
    }
}
