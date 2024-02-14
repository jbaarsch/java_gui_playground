import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JPanel {

    private final int TEAM_SIZE = 3;
    private JLabel[] memberLabels;


    public TeamPanel() {
        memberLabels = new JLabel[TEAM_SIZE];

        // create your own label that have an image and your name as text.
        memberLabels[0] = new JLabel("Sample", new ImageIcon("smile.png"), SwingConstants.CENTER);
        memberLabels[0].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[0].setVerticalTextPosition(SwingConstants.BOTTOM);
        memberLabels[1] = new JLabel();
        memberLabels[2] = new JLabel("Discord Mod", new ImageIcon("Audio Technition.jpg"), SwingConstants.CENTER);
        memberLabels[2].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[2].setVerticalTextPosition(SwingConstants.BOTTOM);



        for (JLabel member : memberLabels) {
            this.add(member);
        }

        this.setPreferredSize(new Dimension(500, 250));
        this.setBackground(Color.LIGHT_GRAY);


    }





}
