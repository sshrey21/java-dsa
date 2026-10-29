package Searching;

public class peakInMountainArray {
    public static int peakElement(int[] arr) {
        int n=arr.length, low=0, high=n-1, peak=-1;
        while(low<high)
        {
            int mid = (low+high)/2;
            if(arr[mid]<arr[mid+1])low=mid+1;
            else high=mid;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,4,3,2,1};
        int index = peakElement(arr);
        System.out.println("Peak present at "+index);
    }
}
