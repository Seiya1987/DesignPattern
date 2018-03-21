package bridge;

public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditive additive) {
        super(additive);
    }

    @Override
    public void makeCoffee() {
        System.out.println("SmallCoffee");
        additive.addSomething();
    }
}
