package adpater;

public class VoltAdapter2 implements FiveVolt {
    private Volt220 volt220;
    public void setVolt220(Volt220 volt220){
        this.volt220 = volt220;
    }

    public int getVolt220(){
        return volt220.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}
