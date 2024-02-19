import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;


    public class Earth implements Icon {
        public Earth(int aSize)
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
            Ellipse2D.Double planet = new Ellipse2D.Double(x + 200, y + 100,
                    size, size);
            g2.setColor(Color.GREEN);
            g2.fill(planet);
        }

        private int size;
    }


