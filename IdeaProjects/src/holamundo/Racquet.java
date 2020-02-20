package holamundo;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Racquet {
    private static final int Y = 330;
    private static final int WITH = 60;
    private static final int HEIGHT = 10;
    int x = 0;
    int xa = 0;
    private Ventana game;

    public Racquet(Ventana game) {
        this.game= game;
    }

    public void move() {
        if (x + xa > 0 && x + xa < game.getWidth()-60)
            x = x + xa;
    }

    public void paint(Graphics2D g) {
        g.fillRect(x, 330, 60, 10);
    }

    public void keyReleased(KeyEvent e) {
        xa = 0;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xa = -8;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xa = 8;
    }
    public Rectangle getBounds() {
        return new Rectangle(x, Y, WITH, HEIGHT);
    }

    public int getTopY() {
        return Y - HEIGHT;
    }
}
