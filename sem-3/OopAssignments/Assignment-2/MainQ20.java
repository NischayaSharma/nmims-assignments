package assgmt2.Q20;

import java.util.*;

public class MainQ20 {

    public static void main(String[] args)
    {
        Set<String> setobj = new HashSet<>();
        setobj.add("Welcome");
        setobj.add("To");
        setobj.add("Geeks");
        setobj.add("For");
        setobj.add("Geeks");
        System.out.println("HashSet: " + setobj);
        Set<String> hashSetToTreeSet = new TreeSet<>(setobj);
        System.out.println("TreeSet: " + hashSetToTreeSet);
    }
}
