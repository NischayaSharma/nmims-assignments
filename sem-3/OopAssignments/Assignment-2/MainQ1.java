package assgmt2.Q1;
import java.util.*;
class Data {
    private int r;

    public int read() {
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        return r;
    }
}

class Area extends Data {
    private double area;

    public void calculate() {
        int r = read();
        area = (22 / 7) * r * r;
    }

    public void display() {
        System.out.println("Area: "+area);
    }
}
 public class MainQ1 {
     public static void main(String[] args){
        Area ar = new Area();
        ar.calculate();
        ar.display();
     }
 }