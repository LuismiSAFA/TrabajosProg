package holamundo;

import java.awt.*;

public class Ball {
    private static final int DIAMETER = 50;
    int x = 0;
    int y = 0;
    int xa = 5;
    int ya = 5;
    private Ventana game;

    public Ball(Ventana game) {
        this.game= game;
    }

    void move() {
        if (x + xa < 0)
            xa = 5;
        if (x + xa > game.getWidth() - DIAMETER)
            xa = -5;
        if (y + ya < 0)
            ya = 5;
        if (y + ya > game.getHeight() - DIAMETER)
            game.gameOver();
        if (collision()){
            ya = -5;
            y = game.racquet.getTopY() - DIAMETER;
        }
        x = x + xa;
        y = y + ya;
    }
    private boolean collision() {
        return game.racquet.getBounds().intersects(getBounds());
    }

    public void paint(Graphics2D g) {
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
}

