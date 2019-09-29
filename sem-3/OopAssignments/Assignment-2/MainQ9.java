package assgmt2.Q9;
import java.util.*;
interface Shape{
  public void computeArea();
  public void display();
}

class Rectangle implements Shape{
  private int side1, side2, area;

  public Rectangle(int a, int b){
    this.side1 = a;
    this.side2 = b;
  }

  public int getSide1(){
    return this.side1;
  }

  public int getSide2(){
    return this.side2;
  }

  public int getArea(){
    return this.area;
  }

  public void setSide1(int a){
    this.side1 = a;
  }

  public void setSide2(int a){
    this.side2 = a;
  }

  public void computeArea(){
    this.area = this.side1 * this.side2;
  }

  public void display(){
    System.out.println("Side 1: "+this.side1+" Side 2: "+this.side2+" Area: "+this.area);
  }
}

class Square implements Shape{
  private int side1, area;

  public Square(int a){
    this.side1 = a;
  }

  public int getSide1(){
    return this.side1;
  }

  public int getArea(){
    return this.area;
  }

  public void setSide1(int a){
    this.side1 = a;
  }

  public void computeArea(){
    this.area = this.side1 * this.side1;
  }

  public void display(){
    System.out.println("Side: "+this.side1+" Area: "+this.area);
  }
}

public class MainQ9{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Shape shape;
    shape = new Rectangle(in.nextInt(), in.nextInt());
    shape.computeArea();
    shape.display();
    shape = new Square(in.nextInt());
    shape.computeArea();
    shape.display();

  }
}
