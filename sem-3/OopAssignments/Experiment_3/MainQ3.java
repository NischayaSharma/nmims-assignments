package exp3.Q3;

import java.util.*;

public class Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num, i, j, k;
        char ch;
        System.out.println("Enter number of lines");
        num = sc.nextInt();
        for (i = 1; i <= num; i++) {
            ch = 'A';
            for (k = i; k < num; k++)
                System.out.print("\t");
            for (j = 1; j <= i; j++) {
                System.out.print(ch + "\t");
                ch += 1;
            }
            ch -= 2;
            for (j = 1; j < i; j++) {
                System.out.print(ch + "\t");
                ch -= 1;
            }
            System.out.println();
        }
    }
}
