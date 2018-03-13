package factorymethod;

public class TestFactoryMethod {
    public static void main(String args[]){
        Factory factory = new FactoryProductA();
        factory.createProduct().method();

        Factory2 factory2 = new ConcreateFactory();
        factory2.createProduct(ProductB.class).method();
    }
}
