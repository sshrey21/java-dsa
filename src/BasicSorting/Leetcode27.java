package BasicSorting;
/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
 The order of the elements may be changed. Then return the number of elements in nums which are not
  equal to val.
  Consider the number of elements in nums which are not equal to val be k,
        to get accepted you need to do the following things:
Change the array nums such that the first k elements of nums
contain the elements which are not equal to val.
The remaining elements of nums are not important as well as the size of nums.
Return k.
 */
public class Leetcode27 {
    public static void print(int[] arr) {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,4,3,2,4,5,6,7,3,1,2,3,3,2,1};
        int val=3;
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==val)
            {
                j=i;
                break;
            }
        }
        if(j==-1) System.out.println("No zero present");
        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=val) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        print(arr);
        System.out.println(j);
    }
}
