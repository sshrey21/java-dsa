package BasicSorting;

public class SelectionSort {
    public static void print(int[] arr) {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={-1,2,4,2,9,56,-10,56,3,9,0};
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min=Integer.MAX_VALUE;
            int mindex=-1;
            for(int j=i;j<n;j++)
            {
                if(arr[j]<min)
                {
                    min = arr[j];
                    mindex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mindex];
            arr[mindex]=temp;
        }
        print(arr);
    }
}

