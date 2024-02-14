import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class EarthIcon implements Icon {
    /**
     Constructs a Mars icon of a given size.
     @param aSize the size of the icon
     */
    public EarthIcon(int aSize)
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
        Ellipse2D.Double planet = new Ellipse2D.Double(x, y,
                size, size);
        g2.setColor(Color.GREEN);
        g2.fill(planet);
    }

    private int size;
}
