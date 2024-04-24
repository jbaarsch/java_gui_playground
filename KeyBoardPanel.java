import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.PrivateKey;
import java.time.Year;
import javax.swing.*;

// This program was influenced by Lewis and Loftus' DirectionPanel, from their Java Software Solutions textbook.
 /*  This panel has a mars Icon that moves around the panel when the arrow keys are pressed.  It makes use of a
 keyListener, who's keyPressed(KeyEvent e) function listens for any key to be pressed, and then retrieves the
 identity of the key from the KeyEvent.  If the Key was the down arrow, the y-coordinate of the icon is increased,
 moving the MarsIcon down.  Other arrow keys respond accordingly, either changing the x- or the y-coordinates.

  */


public class KeyBoardPanel extends JPanel{
    private final int PANEL_HEIGHT = 500,
            PANEL_WIDTH = 500,
            MARS_SIZE = 50,
            STEP = 10;

    Icon movingMars;
    int marsX, marsY;
    public KeyBoardPanel() {
        movingMars = new MarsIcon(MARS_SIZE);
        marsX = PANEL_WIDTH / 2;
        marsY = PANEL_HEIGHT / 2;

        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.GREEN);
        this.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }
            public void keyPressed(KeyEvent e){
                switch(e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        marsY -= STEP;
                        break;
                    case KeyEvent.VK_DOWN:
                        marsY += STEP;
                        break;
                    case KeyEvent.VK_RIGHT:
                        marsX += STEP;
                        break;
                    case KeyEvent.VK_LEFT:
                        marsX -= STEP;
                        break;
                }
                repaint();

            }
            public void keyReleased(KeyEvent e) {}
        });
        this.setFocusable(true);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        movingMars.paintIcon(this, g, marsX, marsY);
    }

    private class DirectionListener implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    marsY -= STEP;
                    break;
                case KeyEvent.VK_DOWN:
                    marsY += STEP;
                    break;
                case KeyEvent.VK_RIGHT:
                    marsX += STEP;
                    break;
                case KeyEvent.VK_LEFT:
                    marsX -= STEP;
                    break;
            }
            repaint();

        }

        @Override
        public void keyTyped(KeyEvent e) {
        }
        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

}
