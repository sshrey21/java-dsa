package BasicSorting;
import java.util.*;
public class commonElement {
    public static void print(ArrayList<Integer> arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] a={3,1,2,1,1,4,5,5};
        int[] b={6,1,1,4,4,2,8};
        Arrays.sort(a);
        Arrays.sort(b);
        int na = a.length;
        int nb = b.length;
        int i=0,j=0;
        ArrayList <Integer> ans = new ArrayList<>();
        while(i<na && j<nb)
        {
            if(a[i]==b[j])
            {
                ans.add(a[i]);
                i++;
                j++;
            }
            else if (a[i]<b[j])
            {
                i++;
            }
            else j++;
        }
        print(ans);

    }
}
