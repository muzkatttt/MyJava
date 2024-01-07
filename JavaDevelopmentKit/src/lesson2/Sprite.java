package lesson2;

import java.awt.*;

public class Sprite {

    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;

    public float getLeft() {
        return x - halfWidth;
    }

    public void setLeft(float left) {
        x = left + halfWidth;
    }

    public float getRight() {
        return x + halfWidth;
    }

    public void setRight(float right) {
        x = right - halfWidth;
    }

    public float getTop() {
        return y - halfHeight;
    }

    public void setTop(float top) {
        y = top + halfHeight;
    }

    public float getBottom() {
        return y + halfHeight;
    }

    public void setBottom(float bottom) {
        y = bottom - halfHeight;
    }

    public float getWidth() {
        return 2f * halfWidth;
    }
    public float getHeight() {
        return 2f * halfHeight;
    }
    void update(MainCanvas canvas, float deltaTime){

    }

    void render(MainCanvas canvas, Graphics g){

    }
}
