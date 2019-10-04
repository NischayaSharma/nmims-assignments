package exp8.Q3;

import java.util.*;

public class MainQ3
{
    public static void main(String[] args){
        int a,b,c,i;
        System.out.println("Enter the 5 elements of first list Nischaya N036");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for(i=5;i>0;i--) {
            a = sc.nextInt();
            list1.add(a);
        }
        System.out.println("Enter the 5 elements of second list Nischaya N036");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(i=5;i>0;i--) {
            b = sc.nextInt();
            list2.add(b);
        }
        System.out.println(list1.equals(list2));
        System.out.println("Same elements in both lists: "+list1.retainAll(list2));
    }
}
