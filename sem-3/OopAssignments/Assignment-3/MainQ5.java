import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class MainQ5 {
    MainQ5(String min, String max) {
        JFrame jfrm = new JFrame("Assignment 3-Q5");
        JPanel panel = new JPanel();
        JLabel minimum = new JLabel("The Minimum value is: " + min);
        JLabel maximum = new JLabel("The Maximum value is: " + max);
        panel.setLayout(new FlowLayout());
        panel.add(minimum);
        panel.add(maximum);
        jfrm.getContentPane().add(panel);
        jfrm.setSize(350, 150);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number(Enter a -ve number to exit): ");
            double minimum = 999999999999999.99999999999;
            double maximum = 0;
            double num = 0.0;
            while (true) {
                num = in.nextDouble();
                if (num < 0) {
                    break;
                }
                minimum = (minimum > num) ? num : minimum;
                maximum = (maximum < num) ? num : maximum;
            }
            new MainQ5(Double.toString(minimum), Double.toString(maximum));
            }
        });
    }
}