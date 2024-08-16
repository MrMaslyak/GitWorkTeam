import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Move implements KeyListener {
    private final Hero hero;

    public Move(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT -> hero.moveRight();
            case KeyEvent.VK_LEFT -> hero.moveLeft();
            case KeyEvent.VK_UP -> hero.moveUp();
            case KeyEvent.VK_DOWN -> hero.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
}