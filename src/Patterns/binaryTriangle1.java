package Patterns;
import java.util.*;
public class binaryTriangle1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("n= ");
        int n=sc.nextInt();
        int flag=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(flag+" ");
                if(flag==1)
                    flag=0;
                else
                    flag=1;

            }
            System.out.println();
        }
    }
}
