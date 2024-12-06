package javase.tutorial.extra.generics.wildcard;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle());
        circles.add(new Circle());
        shapes.add(new Circle());
        shapes.add(new Rectangle());
        drawAll(shapes);
        drawAll2(shapes);
        drawAll2(circles);
    }

    public static void drawAll(List<Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw(new Canvas());
        }
    }

    public static void drawAll2(List<? extends Shape> shapes) {
        for (Shape shape : shapes) {
            shape.draw(new Canvas());
        }
    }

    public void addRectangle(List<? extends Shape> shapes) {
        // Compile-time error!
//        shapes.add(0, new Rectangle());

        //todo sach as problem could solve as below
    }

    public static void addRegistry(Map<String, ? extends Shape> registry) {
//        registry.put("circle", new Circle());// todo it is a problem to solve
    }

    public static void addRegistry2(Map<String, ? super Shape> registry) {
        registry.put("circle", new Circle());// todo it is solved
    }

}
