import java.util.*;

class Ques9 {
    static double volume(double r, double h) {
        return 3.14 * r * r * h;
    }

    static double volume(double s) {
        return s * s * s;
    }

    static double volume(double l, double b, double h) {
        return l * b * h;
    }

    public static void main(String[] args) {
        switch(args[0]){
            case "1":
                System.out.print("Enter the radius: ");
                double radius = in.nextDouble();
                System.out.print("Enter the height: ");
                double height = in.nextDouble();
                System.out.println(volume(radius, height));
                break;
            case "2":
                System.out.print("Enter the side: ");
                double side = in.nextDouble();
                System.out.println(volume(side));
                break;
            case "3":
                System.out.print("Enter the length: ");
                double length = in.nextDouble();
                System.out.print("Enter the breadth: ");
                double breadth = in.nextDouble();
                System.out.print("Enter the height: ");
                height = in.nextDouble();
                System.out.println(volume(length, breadth, height));
                break;
                
        }
    }
}