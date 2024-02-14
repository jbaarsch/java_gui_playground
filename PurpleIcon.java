import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PurpleIcon implements Icon {

    /**
     Constructs a Purple Circle icon of a given size.
     @param aSize the size of the icon
     */
    public PurpleIcon(int aSize)
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
        Ellipse2D.Double circle = new Ellipse2D.Double(x, y,
                size, size);
        g2.setColor(new Color(200, 40, 250));
        g2.fill(circle);
    }

    private int size;
}
