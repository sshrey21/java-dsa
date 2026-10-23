package BasicSorting;
//here in place of finding min and swapping with first of unsorted we intend to find max and swap at last

public class SelectionSort2 {
    public static void print(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={-1,2,4,2,9,56,-10,56,3,9,0};
        int n=arr.length;
        for(int i=n-1;i>0;i--)
        {
            int max = Integer.MIN_VALUE;
            int maxdex = -1;
            for(int j=i;j>=0;j--) {
                if (arr[j] > max) {
                    max = arr[j];
                    maxdex = j;
                }
            }
                int temp = arr[i];
                arr[i] = arr[maxdex];
                arr[maxdex] = temp;
        }
        print(arr);
    }
}
