import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ShapeIconPanel extends JPanel {

    private ArrayList<Icon> imgs;

    public ShapeIconPanel() {
        imgs = new ArrayList<Icon>();

        imgs.add(new MarsIcon(50));
        //add your Icons here.
        imgs.add(new MarsIcon(160));


        this.setPreferredSize(new Dimension(1920, 1080));
        this.setBackground(Color.black);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Icon img : imgs) {
            img.paintIcon(this, g, 0, 0 );
        }
    }









}
