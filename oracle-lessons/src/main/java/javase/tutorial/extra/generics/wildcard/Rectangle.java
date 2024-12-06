package javase.tutorial.extra.generics.wildcard;

import java.awt.*;

public class Rectangle extends Shape {
    private int x, y, width, height;
    @Override
    public void draw(Canvas canvas) {
        System.out.println("draw rectangle");
    }
}
