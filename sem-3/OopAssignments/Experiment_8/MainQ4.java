package exp8.Q4;

import java.util.*;

public class MainQ4 {
    public static void main(String[] args) {
        LinkedList<String> newList = new LinkedList<String>();
        int a, i, j;
        System.out.println("Enter the number of elements Nischaya");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the elements N036");
        String s;
        for (i = 0; i <= a; i++) {
            s = sc.nextLine();
            newList.add(s);
        }
        System.out.println("Original linked list:" + newList);
        for (i = 0; i <= a; i++) {
            System.out.println("Element at index " + i + ": " + newList.get(i));
        }
    }
}