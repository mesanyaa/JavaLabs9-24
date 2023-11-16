package ru.mirea.lab12;

import java.awt.*;

public  abstract class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Shape() {
    }

    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw(Graphics g);

}