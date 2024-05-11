import java.awt.*;
import javax.swing.*;

public class Lesson1 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(600, 600));
        mainPanel.setBackground(Color.YELLOW);

        frame.getContentPane().add(mainPanel);
        frame.pack();

        frame.setVisible(true);


    }







}
