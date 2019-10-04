import java.util.*;

public class MainQ3 {
    public static void main(String args[]) {
        double p, r, t, si = 0, amt = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Principal Amount, Rate and Time");
        p = in.nextDouble();
        r = in.nextDouble();
        t = in.nextDouble();
        si = 0.01 * p * r * t;
        amt = p + si;
        System.out.println("Simple Interest = Rs. " + si);
        System.out.println("Amount = Rs. " + amt);
    }
}
