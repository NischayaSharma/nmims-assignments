package exp8.Q1;

import java.util.*;

public class MainQ1 {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter the integers");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        pair<Integer> p = new pair<Integer>(a, b);
        System.out.println("Before swapping a= " + p.getFirst() + " b= " + p.getSecond());
        p.PairSwap();
        System.out.println("After swapping a= " + p.getFirst() + " b= " + p.getSecond());
    }
}

class pair<T> {
    private T a;
    private T b;

    public pair(T c, T d) {
        a = c;
        b = d;
    }

    T getFirst() {
        return a;
    }

    T getSecond() {
        return b;
    }

    void PairSwap() {
        T temp = a;
        a = b;
        b = temp;
    }
}