package Patterns;
import java.util.*;
public class pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n= ");
        int n=sc.nextInt();
        int nsp=n;
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("1 ");
            }
            for(int s=1;s<=nsp+1;s++)
            {
                System.out.print("  ");
            }
            nsp-=2;
            for(int j=1;j<=i;j++)
            {
                System.out.print("1 ");
            }
            System.out.println();
        }
        for(int i=1;i<=2*n-1;i++)
        {
            System.out.print("1 ");
        }
    }
}
