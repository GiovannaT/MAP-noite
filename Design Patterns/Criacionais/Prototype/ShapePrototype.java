package com.whosvictorm;

public class ShapePrototype {
    protected String shape = "Shape";
    protected Double x = 0.0;
    protected Double y = 0.0;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return shape + ", x = " + x + ", y = " + y + "\n";
    }

    public ShapePrototype clone() {
        throw new RuntimeException("O clone deve ser feito nas subclasses");
    }

}
