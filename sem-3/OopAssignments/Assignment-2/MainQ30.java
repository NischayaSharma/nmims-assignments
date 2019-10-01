package assgmt2.Q30;

import java.util.*;

public class MainQ30 {
  public static void main(String[] args) {
    LinkedList<String> l_list = new LinkedList<String>();
    l_list.add("Red");
    l_list.add("Green");
    l_list.add("Black");
    l_list.add("Pink");
    l_list.add("orange");
    System.out.println("The Original linked list: " + l_list);
    Object firstElement = l_list.removeFirst();
    System.out.println("Element removed: "+ firstElement);
    Object lastElement = l_list.removeLast();
    System.out.println("Element removed: "+ lastElement);
    System.out.println("The New linked list: " + l_list);
  }
}
