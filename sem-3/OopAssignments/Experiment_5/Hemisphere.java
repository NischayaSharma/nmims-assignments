package exp_5.ques3;

import java.util.*;

class Hemisphere extends Volume {
    int calcVol(int radius) {
        return (int) ((4 / 3 * 3.14 * radius * radius * radius) / 2);
    }

    void display() {
        System.out.println("Enter the radius of Hemisphere: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Volume of hemisphere is " + calcVol(in.nextInt()));
    }
}