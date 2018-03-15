package state;

public class PowerOnState implements TvState {
    @Override
    public void preChannel() {
        System.out.println("preChannel");
    }

    @Override
    public void nextChannel() {
        System.out.println("nextChannel");
    }

    @Override
    public void turnOn() {
        System.out.println("turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("turnOff");
    }
}
