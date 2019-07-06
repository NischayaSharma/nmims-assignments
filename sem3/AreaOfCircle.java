import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Radii:");
        int radii = in.nextInt();
        double area = (3.14)*radii*radii;
        System.out.println("The area is "+area);
    }
}
