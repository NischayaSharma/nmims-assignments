package assgmt2.Q2;

import java.util.Scanner;

class Gcd {
    private int num1, num2, gcd;

    Gcd(int a, int b) {
        this.num1 = a;
        this.num2 = b;
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

public class MainQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Gcd hcf = new Gcd(in.nextInt(), in.nextInt());
        hcf.calculate();
        hcf.display();
    }
}