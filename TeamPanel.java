import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JPanel {

    private final int TEAM_SIZE = 3;
    private JLabel[] memberLabels;


    public TeamPanel() {
        memberLabels = new JLabel[TEAM_SIZE];

        // create your own label that have an image and your name as text.
        memberLabels[0] = new JLabel("Connor Sample", new ImageIcon("smile.png"), SwingConstants.LEFT);
        memberLabels[1] = new JLabel("Dakotah Sample", new ImageIcon("funny-animal-picture-hnczwmybpoojbyse.jpg"), SwingConstants.CENTER);
        memberLabels[2] = new JLabel("Ethan Sample", new ImageIcon("TonyHappy.jpg"), SwingConstants.RIGHT);
        memberLabels[0].setHorizontalTextPosition(SwingConstants.LEFT);
        memberLabels[0].setVerticalTextPosition(SwingConstants.BOTTOM);
        memberLabels[1].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[1].setVerticalTextPosition(SwingConstants.BOTTOM);
        memberLabels[2].setHorizontalTextPosition(SwingConstants.RIGHT);
        memberLabels[2].setVerticalTextPosition(SwingConstants.BOTTOM);



        for (JLabel member : memberLabels) {
            this.add(member);
        }

        this.setPreferredSize(new Dimension(1920, 1080));
        this.setBackground(Color.LIGHT_GRAY);


    }





}
