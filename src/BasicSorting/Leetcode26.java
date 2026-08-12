package BasicSorting;
/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that
 each unique element appears only once. The relative order of the elements should be kept the same.
 Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4
respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class Leetcode26 {
    public static void print(int[] arr) {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,1,2,3,4,4,4,5,5,5,5,6,7,7,8};
        print(arr);
        int n=arr.length;
        int j=1; //position of unique element, since arr[0] always uniques therefore initially set to 1
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[i-1])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        print(arr);
    }
}
