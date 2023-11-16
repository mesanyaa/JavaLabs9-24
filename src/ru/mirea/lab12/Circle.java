package ru.mirea.lab12;
import java.awt.*;

public class Circle extends Shape {
    protected int radius;
    public Circle(Color color, int x, int y, int radius) {
        super(color, x, y);
        this.radius = radius;
    }

    public void draw (Graphics g) {
        g.setColor(this.color);
        g.fillOval(x, y, radius, radius);
    }
}
