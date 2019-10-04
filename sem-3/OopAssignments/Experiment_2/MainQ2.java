import java.util.*;
public class MainQ2
{
    Scanner in = new Scanner(System.in);
    double radius;
    double area;
    Circle() {
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
        Circle obj = new Circle();
        obj.AcceptRadius();
        obj.DisplayArea();
    }
}
