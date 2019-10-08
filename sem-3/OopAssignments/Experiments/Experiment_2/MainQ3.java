import java.util.*;
public class MainQ3
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a, b, temp;
        System.out.println("Enter the two numbers a and b");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping:");
        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
}
