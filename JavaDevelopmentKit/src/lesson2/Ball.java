package lesson2;

import java.awt.*;
import java.util.Random;

public class Ball extends Sprite{
    private static Random rnd = new Random();
    private final Color color;
    private float vX;
    private float vY;

    public Ball() {
        halfHeight = 20 + (float) (Math.random() * 50f);
        halfWidth = halfHeight;
        color = new Color(rnd.nextInt());
        vX = 100f + (float) (Math.random() * 280f);
        vY = 100f + (float) (Math.random() * 280f);
    }

    @Override
    void render(MainCanvas canvas, Graphics g) {
        g.getColor();
        g.fillOval((int) getLeft(), (int) getTop(), (int) getWidth(), (int) getHeight());
    }

    @Override
    void update(MainCanvas canvas, float deltaTime) {
        x += vX * deltaTime;
        y += vY * deltaTime;

        if (getLeft() < canvas.getLeft()){
            setLeft(canvas.getLeft());
            vX = -vX;
        }
        if(getRight() > canvas.getRight()){
            setRight(canvas.getRight());
            vX = -vX;
        }
        if(getTop() < canvas.getTop()){
            setTop(canvas.getTop());
            vY = - vY;
        }
        if(getBottom() > canvas.getBottom()){
            setBottom(canvas.getBottom());
            vY = -vY;
        }
    }
}
