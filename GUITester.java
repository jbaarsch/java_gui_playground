import javax.swing.*;

/*  This JFrame displays four different Panels defined in the other classes here.
The TeamPanel is gray, the ShapeIconPanel is black, the KeyBoardPanel is Green and the MousePanel is pink.
Each panel demonstrates a different GUI component.

 */

public class GUITester {


    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel displayPanel = new JPanel();
        displayPanel.add(new TeamPanel());
        displayPanel.add(new ShapeIconPanel());
        displayPanel.add(new KeyBoardPanel());
        displayPanel.add(new MousePanel());

        testFrame.getContentPane().add(displayPanel);
        testFrame.pack();
        testFrame.setVisible(true);

    }

}
