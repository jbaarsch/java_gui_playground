import javax.swing.*;
import java.awt.*;

public class TeamPanel extends JPanel {

    private final int TEAM_SIZE = 3;
    private JLabel[] memberLabels;


    public TeamPanel() {
        memberLabels = new JLabel[TEAM_SIZE];

        // create your own label that have an image and your name as text.


        



        memberLabels[0] = new JLabel("Chuckie", new ImageIcon("basketball.png"), SwingConstants.CENTER);

        memberLabels[0].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[0].setVerticalTextPosition(SwingConstants.BOTTOM);

        memberLabels[1] = new JLabel("Chandler's Label", new ImageIcon("Sun.png"), SwingConstants.CENTER);
        memberLabels[1].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[1].setVerticalTextPosition(SwingConstants.BOTTOM);
        memberLabels[2] = new JLabel();

        memberLabels[1] = new JLabel();
        memberLabels[2] = new JLabel("Justin's Panel", new ImageIcon("moon.png"), SwingConstants.CENTER);
        memberLabels[2].setHorizontalTextPosition(SwingConstants.CENTER);
        memberLabels[2].setVerticalTextPosition(SwingConstants.BOTTOM);




        for (JLabel member : memberLabels) {
            this.add(member);
        }

        this.setPreferredSize(new Dimension(500, 250));
        this.setBackground(Color.LIGHT_GRAY);


    }





}
