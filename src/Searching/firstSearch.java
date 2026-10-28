package Searching;

public class firstSearch {
    public static int firstPos(int[] arr, int target)
    {
        int n = arr.length, low = 0, high = n-1, index = -1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target)
            {
                index = mid;
                high = mid-1;
            }
            else if(arr[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,2,3,4,5,5,5,5,5,6,7,8,9,10};
        int target = 1;
        int index = firstPos(arr, target);
        if(index == -1)
            System.out.println("Not present");
        else
            System.out.println("Element present at "+index);
    }
}
