import java.util.*;
public class MainQ1
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int fact = 1, i, num;
        System.out.println("Enter the number");
        num = in.nextInt();
        for(i=1; i<=num; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of: "+num+" is = "+fact);
    }
}
