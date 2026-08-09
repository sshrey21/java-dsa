package Patterns;
import java.util.*;
public class pattern10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n= ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<i;s++)
                System.out.print("  ");
            for (int j = 1; j <= (n+1)-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
