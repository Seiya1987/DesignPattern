package factorymethod;

public class FactoryProductA extends Factory {

    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
