package BasicSorting;
/* this approach uses bubble sort technique to move all the zeros to the end of the array
 */
public class MoveZerosToEnd {
    public static void print(int[] arr) {
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,2,0,2,0,1,0,34,0,32,0,0,0,2,3,4};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]==0)
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);

    }
}
