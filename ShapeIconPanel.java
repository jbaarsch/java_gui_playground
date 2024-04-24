import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/*  ShapeIconPanel is a panel that holds Icons.  You add the icons to the imgs ArrayList<Icon> and the paint method
paints all the icons in the list onto the panel.

The paintIcon() function takes this component (the component on which the icon will be drawn), the Graphics object
which is the canvas on which to draw the icon, and an x and y coordinate for the place on the canvas the Icon will
be drawn.

 */



public class ShapeIconPanel extends JPanel {

    private ArrayList<Icon> imgs;

    public ShapeIconPanel() {
        imgs = new ArrayList<Icon>();

        imgs.add(new MarsIcon(50));
        //add your Icons here.


        this.setPreferredSize(new Dimension(500, 250));
        this.setBackground(Color.black);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Icon img : imgs) {
            img.paintIcon(this, g, 0, 0 );
        }
    }









}
