package BasicSorting;
/* here j denotes the position where next non zero should come and i is to traverse the array.
 */
public class MovezerosToEnd2 {
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
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                if(i!=j)
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        print(arr);
    }
}
