package Patterns;

import java.sql.SQLOutput;
import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(((char) (j + 65))+" ");
            }
            System.out.println();
        }
    }
}
