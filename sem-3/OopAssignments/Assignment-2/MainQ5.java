package assgmt2.Q5;

import java.util.*;

abstract class Shape {
    public abstract void display();
    public abstract void calculate();
}

class Square extends Shape {
    private int side, area;

    public Square(int a) {
        this.side = a;
    }

    public void calculate() {
        this.area = this.side * this.side;
    }

    public void display(){
        System.out.println("Area: "+this.area);
    }
}

class Triangle extends Shape {
    private int side1, side2, side3;
    private double area;
    public Triangle(int a, int b, int c) {
        this.side1 = a;
        this.side2 = b;
        this.side3 = c;
    }

    public void calculate() {
        int s = side1+side2+side3;
        this.area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public void display(){
        System.out.println("Area: "+ this.area);
    }
}

public class MainQ5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Shape shape;
        shape = new Triangle(in.nextInt(), in.nextInt(), in.nextInt());
        shape.calculate();
        shape.display();
        shape = new Square(in.nextInt());
        shape.calculate();
        shape.display();
    }
}