package assgmt2.Q24;

import java.util.*;

public class MainQ24 {
  public static void main(String[] args) {
    TreeSet <Integer>tree_num = new TreeSet<Integer>();
    TreeSet <Integer>treeheadset = new TreeSet<Integer>();
    tree_num.add(10);
    tree_num.add(22);
    tree_num.add(36);
    tree_num.add(25);
    tree_num.add(16);
    tree_num.add(70);
    tree_num.add(82);
    tree_num.add(89);
    tree_num.add(14);
    int num = (new Scanner(System.in)).nextInt();
    System.out.println("Less than "+num+" : "+tree_num.floor(num-1));
  }
}
