package Searching;
import java.util.*;
public class SearchIn2DArray {
    static Scanner sc=new Scanner(System.in);
    public static int[] search(int[][] arr, int nr, int nc, int key) {
        int low=0, high=nr*nc-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            int rm = mid/nc;
            int cm = mid%nc;
            if(arr[rm][cm]==key)
                return new int[]{rm,cm};
            else if(arr[rm][cm]<key)
                low=mid+1;
            else high=mid-1;
        }
        return new int[]{-1,-1};
    }
    public static void print(int[][] arr,int nr, int nc) {
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void fill(int[][] arr, int nr, int nc) {
        System.out.println("Enter elements in sorted order");
        for(int i=0;i<nr;i++)
        {
            for(int j=0;j<nc;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
        System.out.print("Nr= ");
        int nr=sc.nextInt();
        System.out.print("Nc= ");
        int nc=sc.nextInt();
        System.out.println("Enter key");
        int key=sc.nextInt();
        int[][] arr=new int[nr][nc];
        fill(arr, nr, nc);
        print(arr,nr,nc);
        int[] index = search(arr, nr, nc, key);
        int row=index[0];
        int col=index[1];
        System.out.println(row+", "+ col);
    }
}
