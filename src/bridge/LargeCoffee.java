package bridge;

public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditive additive) {
        super(additive);
    }

    @Override
    public void makeCoffee() {
        System.out.println("LargeCoffee" );
        additive.addSomething();
    }
}
