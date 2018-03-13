package factorymethod;

public abstract class Factory2 {

    public abstract <T extends Product> T createProduct(Class<T> clz);

}
