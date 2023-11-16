package ru.mirea.lab12;

import java.awt.*;

public class Rectangle extends Shape {
    protected int width;
    protected int length;
    public Rectangle(Color color, int x, int y, int width, int length) {
        super(color, x, y);
        this.width = width;
        this.length = length;
    }

    public void draw (Graphics g) {
        g.setColor(this.color);
        g.fillRect(x, y, width, length);
    }
}
