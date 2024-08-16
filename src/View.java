import javax.swing.*;

public class View extends JFrame {
    public View() {
        HeroIlya heroIlya = new HeroIlya();
        add(heroIlya);
        addKeyListener(new Move(heroIlya));
        setLayout(null);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new View();
    }
}