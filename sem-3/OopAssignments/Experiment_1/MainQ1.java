import java.util.*;

public class MainQ1 {
    public static void main(String args[]) {
        int a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }
}
