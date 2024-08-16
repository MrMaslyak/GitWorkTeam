import javax.swing.*;
import java.awt.*;

class Hero extends JPanel {
    private int x = 100;
    private int y = 100;
    private final int width = 100;
    private final int height = 100;

    public Hero() {
        setBounds(x, y, width, height);
        setBackground(Color.BLACK);
    }

    public void moveRight() {
        x += 10;
        setLocation(x, y);
        repaint();
    }

    public void moveLeft() {
        x -= 10;
        setLocation(x, y);
        repaint();
    }

    public void moveUp() {
        y -= 10;
        setLocation(x, y);
        repaint();
    }

    public void moveDown() {
        y += 10;
        setLocation(x, y);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, width, height);
    }
}