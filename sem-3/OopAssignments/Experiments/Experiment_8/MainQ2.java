package exp8.Q2;

import java.util.*;

public class pairminmax {
    public static void main(String args[]) {
        int a, i;
        System.out.println("Enter the 5 elements Nischaya N036");
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        for (i = 5; i >= 0; i--) {
            a = sc.nextInt();
            list.add(a);
        }
        System.out.println("List: " + list);
        int minList = Collections.min(list);
        int maxList = Collections.max(list);
        System.out.println("Minimum value of list is: " + minList);
        System.out.println("Maximum value of list is: " + maxList);
    }
}
