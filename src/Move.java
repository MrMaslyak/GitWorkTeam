import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Move implements KeyListener {
    private final HeroIlya heroIlya;

    public Move(HeroIlya heroIlya) {
        this.heroIlya = heroIlya;
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_D -> heroIlya.moveRight();
            case KeyEvent.VK_A -> heroIlya.moveLeft();
            case KeyEvent.VK_W -> heroIlya.moveUp();
            case KeyEvent.VK_S -> heroIlya.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
}