package factorymethod;

public class FactoryProductB extends Factory {

    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
