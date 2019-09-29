package assgmt2.Q8;

import java.util.*;

interface Account{
  public void set(double a, double b, double c);
  public void display();
}

interface Person{
  public void store(String str, int num);
  public void display();
}

class Customer implements Person, Account{
  private String name;
  private int accntNum;
  private double balance, interest, time;

  public void set(double a, double b, double c){
    this.balance = a;
    this.interest = b;
    this.time = c;
  }

  public void store(String str, int num){
    this.name = str;
    this.accntNum = num;
  }

  public void display(){
    System.out.println("Name: "+this.name+"\nAccount Number: "+this.accntNum+"\nOpening Balance: "+balance+"\nRate of Interest: "+interest+"\nBalance after "+time+" years: "+(balance+(balance*interest*time/100)));
  }
}

public class MainQ8{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Customer cust = new Customer();
    cust.store(in.nextLine(),in.nextInt());
    cust.set(in.nextDouble(),in.nextDouble(),in.nextDouble());
    cust.display();
  }
}
