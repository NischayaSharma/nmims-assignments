package exp_5.ques3;

import java.util.*;

class Sphere extends Volume {
    int calcVol(int radius) {
        return (int) (4 / 3 * 3.14 * radius * radius * radius);
    }

    void display() {
        System.out.println("Enter the radius of Sphere: ");
        Scanner in = new Scanner(System.in);
        System.out.println("Volume of sphere is " + calcVol(in.nextInt()));
    }
}