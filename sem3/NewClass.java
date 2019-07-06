import java.util.*;
public class NewClass {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = in.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = in.nextDouble();
        double add = num1+num2;
        double sub = num1-num2;
        double mul = num1*num2;
        double div = num1/num2;
        System.out.println(num1+"+"+num2+"="+add);
        System.out.println(num1+"-"+num2+"="+sub);
        System.out.println(num1+"*"+num2+"="+mul);
        System.out.println(num1+"/"+num2+"="+div);
    }
}
