package Searching;

public class binSearchReverse {
    public static int binSearch(int[] arr, int target) {
        int n=arr.length, low = 0, high =n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 9;
        int index = binSearch(arr, target);
        if(index ==-1)
            System.out.println("Element not in array");
        else
            System.out.println("Element present at "+ index);
    }
}
