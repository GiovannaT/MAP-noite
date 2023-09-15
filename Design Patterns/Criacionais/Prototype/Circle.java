package com.whosvictorm;

public class Circle extends ShapePrototype{

    protected Circle(Circle circle){
        this.shape = "Circle";
        this.x = circle.getX();
        this.y = circle.getY();
    }

    public Circle() {
    }

    @Override
    public ShapePrototype clone() {
        return new Circle(this);
    }
}
