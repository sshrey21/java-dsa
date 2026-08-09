package Patterns;
import java.util.*;
public class bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n= ");
        int n = sc.nextInt();
        int nsp=1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            for(int s=1;s<=nsp;s++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            nsp+=2;
            System.out.println();
        }

    }
}
