import java.util.*;
public class MainQ2
{
    Scanner in = new Scanner(System.in);
    double radius;
    double area;
    MainQ2() {
        radius=0;
    }
    void AcceptRadius() {
        System.out.println("Enter the radius");
        radius = in.nextInt();
    }
    double CalculateArea(double r) {
        double a = 3.14*r*r;
        return a;
    }
    void DisplayArea() {
        area = CalculateArea(radius);
        System.out.println("Area = " +area);
    }
    public static void main(String args[]) {
        MainQ2 obj = new MainQ2();
        obj.AcceptRadius();
        obj.DisplayArea();
    }
}
