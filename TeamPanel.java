import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JPanel {

    private final int TEAM_SIZE = 3;
    private JLabel[] memberLabels;


    public TeamPanel() {
        memberLabels = new JLabel[TEAM_SIZE];

         //create your own label that have an image and your name as text.
        memberLabels[0] = new JLabel("Sample", new ImageIcon("smile.png"), SwingConstants.CENTER);
        memberLabels[0].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[0].setVerticalTextPosition(SwingConstants.BOTTOM);
        memberLabels[1] = new JLabel("Owen", new ImageIcon("BruceBear.png"), SwingConstants.CENTER);
        memberLabels[1].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[1].setVerticalTextPosition(SwingConstants.BOTTOM);
<<<<<<< Updated upstream
        memberLabels[2] = new JLabel();
=======
        memberLabels[2] = new JLabel("Canon", new ImageIcon("fries.jpg"), SwingConstants.CENTER);
>>>>>>> Stashed changes



        for (JLabel member : memberLabels) {
            this.add(member);
        }

<<<<<<< Updated upstream
        this.setPreferredSize(new Dimension(850, 500));
=======
        this.setPreferredSize(new Dimension(750, 1000));
>>>>>>> Stashed changes
        this.setBackground(Color.LIGHT_GRAY);


    }





}
