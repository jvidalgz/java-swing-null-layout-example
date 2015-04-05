import javax.swing.*;
import java.awt.*;

/**
 * Created by jaime on 05-04-2015.
 */
public class NullLayoutExample {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = frame.getContentPane();
        contentPane.setLayout(null);



        JButton b1 = new JButton("Button");
        JButton b2 = new JButton("2");
        contentPane.add(b1);
        contentPane.add(b2);

        b1.setBounds(10, 10,100, 20);
        b2.setBounds(120, 10, 150, 40);

        frame.setBounds(0, 0, 350, 100);
        frame.setVisible(true);

    }
}
