// Interface para produtos
interface Product {
    void create();
}

// Implementações de produtos
class ConcreteProduct1 implements Product {
    @Override
    public void create() {
        System.out.println("Product 1 created");
    }
}

class ConcreteProduct2 implements Product {
    @Override
    public void create() {
        System.out.println("Product 2 created");
    }
}

// Fábrica para criar produtos
class ProductFactory {
    public static Product createProduct(String type) {
        if ("product1".equalsIgnoreCase(type)) {
            return new ConcreteProduct1();
        } else if ("product2".equalsIgnoreCase(type)) {
            return new ConcreteProduct2();
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("product1");
        product1.create();

        Product product2 = ProductFactory.createProduct("product2");
        product2.create();
    }
}
