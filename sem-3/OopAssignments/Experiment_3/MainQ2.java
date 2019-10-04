package exp3.Q2;
import java.util.*;
public class MainQ2
{
    double Volume(double r, double h)
    {
        return 3.14*r*r*h;
    }
    double Volume(double a)
    {
        return a*a*a;
    }
    double Volume(double l, double b, double h)
    {
        return l*b*h;
    }
    public static void main(String args[])
    {
        Volume_Overload obj = new Volume_Overload();
        Scanner sc = new Scanner(System.in);
        int ch;
        double vol;
        System.out.println("Enter choice to find volume of:-");
        System.out.println("1) Cylinder");
        System.out.println("2) Cube");
        System.out.println("3) Cuboid");
        ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("Enter radius and height");
                double radius = sc.nextDouble();
                double height = sc.nextDouble();
                vol = obj.Volume(radius, height);
                System.out.println("Volume = " +vol);
                break;
            case 2:
                System.out.println("Enter side of cube");
                double side = sc.nextDouble();
                vol = obj.Volume(side);
                System.out.println("Volume = " +vol);
                break;
            case 3:
                System.out.println("Enter length, breadth and height");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                double height1 = sc.nextDouble();vol = obj.Volume(length, breadth, height1);
                System.out.println("Volume = " +vol);
                break;
            default:
                System.out.println("INVALID INPUT!");
                break;
        }
    }
}
