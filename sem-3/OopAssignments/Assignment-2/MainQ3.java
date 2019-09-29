package assgmt2.Q3;

import java.util.Scanner;

class Gcd {
    private int num1, num2, gcd;

    Gcd() {
        this.num1 = 0;
        this.num2 = 0;
    }

    public void input(){
        Scanner in = new Scanner(System.in);
        this.num1 = in.nextInt();
        this.num2 = in.nextInt();
    }

    private int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }

    public void calculate() {
        this.gcd = findGCD(this.num1, this.num2);
    }

    public void display() {
        System.out.println("GCD: " + this.gcd);
    }
}

public class MainQ3 {
    public static void main(String[] args) {
        Gcd hcf = new Gcd();
        hcf.input();
        hcf.calculate();
        hcf.display();
    }
}