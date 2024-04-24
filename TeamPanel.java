import javax.swing.*;
import java.awt.*;

/*  The Team Panel displays an image and a name together representing a single team member.  There are
issues getting the images to appear if they are larger than the size allowed by the panel.

Each JLabel in the memberLabels array can hold both an Icon and text.  The methods to adjust the icon are .getIcon()
and .setIcon(Icon icon).  The methods to set the text are .getText() and .setText(String text)



 */
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
        memberLabels[2] = new JLabel();



        for (JLabel member : memberLabels) {
            this.add(member);
        }

        this.setPreferredSize(new Dimension(500, 250));
        this.setBackground(Color.LIGHT_GRAY);


    }





}
