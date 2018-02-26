package builder;

public abstract class Computer {
    protected String mBorad;
    protected String mDisplay;
    protected String mOs;

    protected Computer(){

    }

    public void setBorad(String borad){
        this.mBorad = borad;
    }

    public void setDisplay(String display){
        this.mDisplay = display;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer{" +
                "mBorad='" + mBorad + '\'' +
                ", mDisplay='" + mDisplay + '\'' +
                ", mOs='" + mOs + '\'' +
                '}';
    }

}
