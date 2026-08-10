package BasicSorting;
/*yet another two pointer approach its just here we use j as a pointer to denote the index where
first and then other zeros are present and i denotes non zero element
 */
public class MoveZerosToEnd3 {
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
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j==-1) System.out.println("No zero present");
        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        print(arr);
    }
}
