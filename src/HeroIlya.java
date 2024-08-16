import javax.swing.*;
import java.awt.*;

class HeroIlya extends JPanel {
    private int x = 250;
    private int y = 100;
    private final int width = 100;
    private final int height = 100;

    public HeroIlya() {
        setBounds(x, y, width, height);
        setBackground(Color.RED);
    }

    public void moveRight() {
        x += 20;
        setLocation(x, y);
        repaint();
    }

    public void moveLeft() {
        x -= 20;
        setLocation(x, y);
        repaint();
    }

    public void moveUp() {
        y -= 20;
        setLocation(x, y);
        repaint();
    }

    public void moveDown() {
        y += 20;
        setLocation(x, y);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(0, 0, width, height);
    }
}