import javax.swing.*;

public class View extends JFrame {
    public View() {
        HeroIgor heroIgor = new HeroIgor();
        HeroIlya heroIlya = new HeroIlya();
        add(heroIgor);
        add(heroIlya);
        addKeyListener(new Move(heroIlya, heroIgor));
        setLayout(null);
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new View();
    }
}