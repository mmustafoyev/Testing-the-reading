package javase.tutorial.extra.generics.wildcard;

import java.awt.*;

public class Circle extends Shape {
    private int radius, x, y;
    @Override
    public void draw(Canvas canvas) {
        System.out.println("draw circle");
    }
}
