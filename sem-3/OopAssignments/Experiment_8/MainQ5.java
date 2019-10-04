package exp8.Q5;

import java.util.*;

public class MainQ5 {
    public static void main(String[] args) {
        LinkedList<String> newList = new LinkedList<String>();
        int a, b = 1, i, j;
        System.out.println("Enter the number of elements Nischaya");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Enter the elements N036");
        String s, z;
        for (i = 0; i <= a; i++) {
            s = sc.nextLine();
            newList.add(s);
        }
        while (b != 0) {
            z = "The Phantom of the Opera is HHHEEERRRRREEEEE";
            System.out.println("Enter element to search");
            z = sc.next();
            if (newList.contains(z)) {
                System.out.println("Element exists");
            } else {
                System.out.println("Element does not exist");
            }
            System.out.println("Press 0 to exit, 9 to continue searching Nischaya");
            b = sc.nextInt();
        }
    }
}