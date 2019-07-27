import java.util.Scanner;
class Swapping{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers\na = ");
        int num1 = in.nextInt();
        System.out.print("b = ");
        int num2 = in.nextInt();
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.print("The two numbers are \na = "+num1+"\nb = "+num2);
    }
}