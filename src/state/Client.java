package state;

public class Client {
    public static void main(String[] args){
        TvControl tvControl = new TvControl();
        tvControl.powerOn();
        tvControl.nextChannel();
        tvControl.turnOn();
        tvControl.powerOff();
        tvControl.turnOff();
    }
}
