package assgmt2.Q4;

import java.util.*;

class Input {
    int radii() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}

class CalcCircle extends Input {
    private double area;
    public void area() {
        int radius = radii();
        this.area = (3.14 * radius * radius);
    }

    public void display() {
        System.out.println(this.area);
    }
}

class CalcSphere extends CalcCircle {
    private double volume;
    public void volume() {
        int radius = radii();
        this.volume =  (4 / 3 * 3.14 * radius * radius * radius);
    }

    public void display() {
        System.out.println(this.volume);
    }
}

public class MainQ4{
    public static void main(String[] args) {
        CalcSphere sphere = new CalcSphere();
        CalcCircle circle = new CalcCircle();
        circle.volume();
        circle.display();
        sphere.volume();
        sphere.display();
    }
}
