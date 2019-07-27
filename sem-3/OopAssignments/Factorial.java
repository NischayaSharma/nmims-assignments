import java.util.Scanner;

class Factorial{
    private static int fact(int num){
        if(num==1||num==0)
            return 1;
        else
            return num*fact(num-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number whose factorial you want to find: ");
        int num = in.nextInt();
        int factorial = fact(num);
        System.out.print("The factorial of "+num+" is "+factorial);
    }
}