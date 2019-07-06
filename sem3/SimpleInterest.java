import java.util.*;
public class SimpleInterest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        double principle = in.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double inter = in.nextDouble();
        System.out.print("Enter Time: ");
        double time = in.nextDouble();
        double simpleInterest = principle*inter*time/100;
        System.out.println("The Interest is "+simpleInterest);
        System.out.println("The final amount you have to give is "+(principle+simpleInterest));
    }
}
