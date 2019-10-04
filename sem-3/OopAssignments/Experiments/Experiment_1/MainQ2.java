import java.util.*;

public class MainQ2 {
    public static void main(String args[]) {
        double r, a = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        r = in.nextDouble();
        a = 3.14 * r * r;
        System.out.println("Area = " + a);
    }
}
