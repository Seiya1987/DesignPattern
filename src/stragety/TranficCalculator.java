package stragety;

public class TranficCalculator {
    CalculateStrategy strategy;
    public void setStrategy(CalculateStrategy strategy){
        this.strategy = strategy;
    }

    public int calculatePrice(int km){
         return this.strategy.calculatePrice(km);
    }

    public static void main(String args[]){
        TranficCalculator calculator = new TranficCalculator();
        calculator.setStrategy(new BusCalculateStrategy());
        System.out.println("Bus calculate : " + calculator.calculatePrice(20));
    }
}
