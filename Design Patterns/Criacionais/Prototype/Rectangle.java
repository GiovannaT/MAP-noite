package com.whosvictorm;

public class Rectangle extends ShapePrototype{

    protected Rectangle(Rectangle rectangle){
        this.shape = "Rectangle";
        this.x = rectangle.getX();
        this.y = rectangle.getY();
    }

    public Rectangle() {
    }

    @Override
    public ShapePrototype clone() {
        return new Rectangle(this);
    }
}
