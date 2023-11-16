package ru.mirea.lab12;

import javax.swing.*;
import java.awt.*;
import java.util.Random;


public class SecondGUI extends JFrame{
    private static Shape[] shapes = new Shape[20];
    public void paint(Graphics g) {
        super.paint(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }
    public SecondGUI() {
        setTitle("DZ2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        Shape shape;
        Random random = new Random();
        int circleOrRect, x, y, width, height, radius;

        for (int i = 0; i < 20; i++) {
            circleOrRect = random.nextInt(2);
            x = random.nextInt(380);
            y = random.nextInt(380);
            Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));

            if (circleOrRect == 0) {
                width = random.nextInt(110);
                height = random.nextInt(110);
                shape = new Rectangle(color, x, y, width, height);
            } else {
                radius = random.nextInt(50);
                shape = new Circle(color, x, y, radius);
            }
            shapes[i] = shape;
        }
    }
}
