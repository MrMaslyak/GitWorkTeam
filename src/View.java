import javax.swing.*;

public class View extends JFrame {
    public View() {
        Hero hero = new Hero();
        add(hero);
        addKeyListener(new Move(hero));
        setLayout(null);  // Use absolute positioning
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new View();
    }
}