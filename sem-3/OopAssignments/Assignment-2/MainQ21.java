package assgmt2.Q21;

import java.util.*;

public class MainQ21 {
	public static void main(String[] argv)
	{
		HashSet<Integer> arrset1 = new HashSet<Integer>();
		arrset1.add(10);
		arrset1.add(20);
		arrset1.add(30);
		arrset1.add(40);
		arrset1.add(50);
		System.out.println("First HashSet: " + arrset1);
		HashSet<Integer> arrset2 = new HashSet<Integer>();
		arrset2.add(10);
		arrset2.add(20);
		arrset2.add(30);
		System.out.println("Second HashSet: " + arrset2);
		boolean value = arrset1.equals(arrset2);
		System.out.println("Are both set equal: " + value);
	}
}
