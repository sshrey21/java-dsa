package Patterns;
import java.util.*;
public class rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n= ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
                System.out.print("  ");
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
//            for(int k=1;k<=n-i;k++)
//            {
//                System.out.print("* ");
//            }
            System.out.println();
        }
    }
}
