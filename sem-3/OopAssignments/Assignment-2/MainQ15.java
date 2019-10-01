package assgmt2.Q15;

import java.util.*;

public class MainQ15{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Integer num1 = in.nextInt();
    Integer num2 = in.nextInt();
    Integer num3 = in.nextInt();
    System.out.println("Max: "+Math.max(Integer.valueOf(num1),Math.max(Integer.valueOf(num2),Integer.valueOf(num3))));
  }
}
