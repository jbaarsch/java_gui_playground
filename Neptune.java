import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


    /**
     An icon that has the shape of the planet NEPTUNE.
     */
    public class Neptune implements Icon
    {
        /**
         Constructs a NEPTUNE icon of a given size.
         @param aSize the size of the icon
         */
        public Neptune(int aSize)
        {
            size = aSize;
        }

        public int getIconWidth()
        {
            return size;
        }

        public int getIconHeight()
        {
            return size;
        }

        public void paintIcon(Component c, Graphics g, int x, int y)
        {
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D.Double planet = new Ellipse2D.Double(x+200, y+50,
                    size, size);
            g2.setColor(Color.BLUE);
            g2.fill(planet);
        }

        private int size;
    }


