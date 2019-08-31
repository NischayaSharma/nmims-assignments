import java.util.*;

class Assignment1 {
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static void ques1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for n:");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 1 / fact(i);
        }
        System.out.println(sum);
    }

    static void ques3() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) k++);
            }
            System.out.println();
        }
    }

    static void ques4() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((k++ % 2 == 0) ? "0" : "1");
            }
            System.out.println();
        }
    }

    static void ques5() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum += 1 / Math.pow(2, i);
        }
        System.out.println(sum);
    }

    static int numOfDigits(int n) {
        int counter = 0;
        while (n != 0) {
            counter++;
            n = n / 10;
        }
        return counter;
    }

    static void ques6() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0, temp = n;
        while (temp % 10 != 0) {
            sum += Math.pow(temp % 10, numOfDigits(n));
            temp = temp / 10;
        }
        if (sum == n) {
            System.out.println("Armstrong " + sum);
        } else {
            System.out.println("Not Armstrong " + sum);
        }
    }

    static void ques7() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), sumOdd = 0, sumEven = 0;
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println(sumEven / n + " <-Even Odd-> " + sumOdd / n);
    }

    static void ques8() {
        Scanner in = new Scanner(System.in);
        StringBuffer strBuff = new StringBuffer(in.next());
        int num1 = Integer.parseInt(strBuff.toString());
        strBuff.reverse();
        int num2 = Integer.parseInt(strBuff.toString());
        if (num1 == num2) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

    public static void main(String[] args) {
        ques8();
    }
}