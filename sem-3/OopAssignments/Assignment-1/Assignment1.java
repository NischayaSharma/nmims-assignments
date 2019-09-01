import java.util.*;

class Assignment1 {
    private static Scanner in = new Scanner(System.in);
    static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static void ques1() {
        System.out.println("Enter a value for n:");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += 1 / fact(i);
        }
        System.out.println(sum);
    }

    static void ques3() {
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
        int n = in.nextInt();
        int sum = 0, temp = n;
        while (temp % 10 != 0) {
            sum += Math.pow(temp % 10, numOfDigits(n));
            temp = temp / 10;
        }
        System.out.println((sum == n)? "Armstrong ":"Not Armstrong " + sum);
    }

    static void ques7() {
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
        StringBuffer strBuff = new StringBuffer(in.next());
        String str1 = (strBuff.toString());
        strBuff.reverse();
        String str2 = (strBuff.toString());
        if (str1.equals(str2)) {
            System.out.println("Palindrome.");
        } else {
            System.out.println("Not a palindrome.");
        }
    }

    static void ques10() {
        int num1 = in.nextInt();
        int num2 = num1 << 2;
        System.out.println(num2);
    }

    static void ques11() {
        int num1 = in.nextInt();
        int num2 = num1 >> 3;
        System.out.println(num2);
    }

    static void ques12() {
        int num1 = in.nextInt();
        int num2 = num1>>3;
        System.out.println(num2);
    }

    public static void main(String[] args) {
        ques8();
    }
}