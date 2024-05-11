import javax.swing.*;

public class GUITester extends JFrame {

    public GUITester() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel displayPanel = new JPanel();
        displayPanel.add(new TeamPanel());
        displayPanel.add(new ShapeIconPanel());
        displayPanel.add(new KeyBoardPanel());
        displayPanel.add(new MousePanel());

        this.getContentPane().add(displayPanel);
        this.pack();
        this.setVisible(true);
    }



    public static void main(String[] args) {
        JFrame testFrame = new JFrame();
        testFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);

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
