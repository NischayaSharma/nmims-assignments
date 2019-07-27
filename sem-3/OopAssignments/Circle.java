import java.util.Scanner;

class Circle
 {
    private static int radius = 0;
    private static double area = 0;
    private static Scanner in = new Scanner(System.in);

    static void inputRadius() {
        System.out.print("Enter the radius: ");
        radius = in.nextInt();
    }

    static void calculateArea() {
        area = 3.14 * radius * radius;
    }

    static void displayArea() {
        System.out.println("The area is " + area);
    }

    public static void main(String[] args) {
        inputRadius();
        calculateArea();
        displayArea();
    }
}