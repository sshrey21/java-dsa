package Searching;

public class floorInSortedArray {
    public static int floorArray(int[] arr, int x) {
        int n=arr.length, low=0, high=n-1, idx=-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
//            if(arr[mid]==x)
//            {
//                idx=mid;
//                low = mid+1;
//            }
//            else if(arr[mid]>x)high=mid-1;
//            else {
//                idx=mid;
//                low=mid+1;
//            }
            //because we are literally doing the same task in if and else part therefore we can combine it
            if(arr[mid]<=x)
            {
                idx = mid;
                low = mid+1;
            }
            else high = mid-1;
        }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr={1,2,8,10,10,12,19};
        int x = 14;
        int index = floorArray(arr, x);
        System.out.println("floor present at "+index);
    }

}
