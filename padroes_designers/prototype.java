import java.util.HashMap;
import java.util.Map;

// Classe base para objetos que podem ser clonados
class Shape implements Cloneable {
    private String type;

    public Shape(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

// Classe que gerencia objetos protótipo
class ShapePrototype {
    private static Map<String, Shape> shapeMap = new HashMap<>();

    static {
        shapeMap.put("circle", new Shape("circle"));
        shapeMap.put("square", new Shape("square"));
    }

    public static Shape getShape(String type) throws CloneNotSupportedException {
        return (Shape) shapeMap.get(type).clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Shape circle = ShapePrototype.getShape("circle");
        System.out.println("Shape: " + circle.getType());

        Shape square = ShapePrototype.getShape("square");
        System.out.println("Shape: " + square.getType());
    }
}
