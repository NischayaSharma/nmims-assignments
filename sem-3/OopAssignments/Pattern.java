import java.util.Scanner;

class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numOfLines = in.nextInt();
        for (int i = 0; i < numOfLines; i++) {
            for (int j = numOfLines-1; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 65; k <= (65 + i); k++) {
                System.out.print((char) k);
            }
            for (int k = (65 + i - 1); k >= 65; k--) {
                System.out.print((char) k);
            }
            System.out.println();
        }
    }
}