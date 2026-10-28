package Searching;

public class binarySearch {
    public static int binSearch(int[] arr, int target)
    {
        int n = arr.length, low = 0, high = n-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) high = mid-1;
            else low = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,23,4,25,45,34,61,289,55,90};
        int target = 289;
        int tarDex = binSearch(arr, target);
        if(tarDex == -1)
            System.out.println("Element not in array");
        else
            System.out.println("Element present in array at "+ tarDex);
    }
}

