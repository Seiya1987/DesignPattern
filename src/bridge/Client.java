package bridge;

import Memento.Original;

public class Client {

    public static void main(String[] args){
        OriginalAdditive originalAdditive = new OriginalAdditive();

        SugarAdditive sugarAdditive = new SugarAdditive();

        LargeCoffee largeCoffee = new LargeCoffee(originalAdditive);
        largeCoffee.makeCoffee();

        SmallCoffee smallCoffee = new SmallCoffee(sugarAdditive);
        smallCoffee.makeCoffee();

    }
}
