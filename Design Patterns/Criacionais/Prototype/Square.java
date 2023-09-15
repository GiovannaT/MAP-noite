package com.whosvictorm;

public class Square extends ShapePrototype{

    protected Square(Square square){
        this.shape = "Square";
        this.x = square.getX();
        this.y = square.getY();
    }

    public Square() {
    }

    @Override
    public ShapePrototype clone() {
        return new Square(this);
    }
}
