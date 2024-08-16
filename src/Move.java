import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Move implements KeyListener {
    private  HeroIlya heroIlya;
    private  HeroIgor heroIgor;

    public Move(HeroIlya heroIlya, HeroIgor heroIgor) {
        this.heroIlya = heroIlya;
        this.heroIgor = heroIgor;
    }

    @Override
    public void keyTyped(KeyEvent e) { }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_RIGHT -> heroIgor.moveRight();
            case KeyEvent.VK_LEFT -> heroIgor.moveLeft();
            case KeyEvent.VK_UP -> heroIgor.moveUp();
            case KeyEvent.VK_DOWN -> heroIgor.moveDown();
            case KeyEvent.VK_D -> heroIlya.moveRight();
            case KeyEvent.VK_A -> heroIlya.moveLeft();
            case KeyEvent.VK_W -> heroIlya.moveUp();
            case KeyEvent.VK_S -> heroIlya.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
}