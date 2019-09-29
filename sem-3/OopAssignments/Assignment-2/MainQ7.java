package assgmt2.Q7;

import java.util.*;

interface Area {
  public void compute();
  public void display();
}

class Circle implements Area{
  private int radius;
  private double area;
  Circle(int a){
    this.radius = a;
  }

  public void compute(){
    this.area = (22/7)*this.radius*this.radius;
  }

  public void display(){
    System.out.println("Area: "+this.area);
  }
}

class Rectangle implements Area{
  private int side1, side2;
  private double area;
  Rectangle(int a, int b){
    this.side1 = a;
    this.side2 = b;
  }

  public void compute(){
    this.area = this.side1*this.side2;
  }

  public void display(){
    System.out.println("Area: "+this.area);
  }
}

public class MainQ7{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Area ar;
    Rectangle rect = new Rectangle(in.nextInt(), in.nextInt());
    ar = rect;
    ar.compute();
    ar.display();
  }
}
