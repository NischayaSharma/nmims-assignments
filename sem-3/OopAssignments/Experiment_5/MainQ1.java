package exp_5.ques1;

import java.util.*;

class MainQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape anyShape;
        System.out.println("Enter the length and breadth of the rectangle:");
        anyShape = new Rectangle(in.nextInt(), in.nextInt());
        debug("The area of rectangle is "+anyShape.area());
        System.out.println("Enter the 3 sides of the triangle:");
        anyShape = new Triangle(in.nextInt(), in.nextInt(), in.nextInt());
        debug("The area of triangle is "+anyShape.area());
    }

    static void debug(String msg) {
        System.out.println(msg);
    }

    static void debug(int msg) {
        System.out.println(msg);
    }
}