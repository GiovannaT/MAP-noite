package com.whosvictorm;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Square square = new Square();

        ShapePrototype newRectangle = rectangle.clone();
        newRectangle.setX(15.5);
        newRectangle.setY(30.0);
        System.out.println(newRectangle);

        ShapePrototype newCircle = circle.clone();
        newCircle.setX(5.0);
        newCircle.setY(10.0);
        System.out.println(newCircle);

        ShapePrototype newSquare = square.clone();
        System.out.println(newSquare);

    }
}