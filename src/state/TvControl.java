package state;

public class TvControl implements PowerController{
    TvState tvState;
    public void setTvState(TvState tvState){
        this.tvState = tvState;
    }

    @Override
    public void powerOn() {
        setTvState(new PowerOnState());
        System.out.println("powerOn");
    }

    @Override
    public void powerOff() {
        setTvState(new PowerOffState());
        System.out.println("powerOff");
    }

    public void preChannel(){
        tvState.preChannel();
    }

    public void nextChannel(){
        tvState.nextChannel();
    }

    public void turnOn(){
        tvState.turnOn();
    }

    public void turnOff(){
        tvState.turnOff();
    }


}
