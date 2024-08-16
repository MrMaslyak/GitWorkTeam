import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Move implements KeyListener {
    private final HeroIlya heroIlya;
    private final Hero hero;

    public Move(HeroIlya heroIlya) {
        this.heroIlya = heroIlya;
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
            case KeyEvent.VK_D -> heroIlya.moveRight();
            case KeyEvent.VK_A -> heroIlya.moveLeft();
            case KeyEvent.VK_W -> heroIlya.moveUp();
            case KeyEvent.VK_S -> heroIlya.moveDown();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) { }
}