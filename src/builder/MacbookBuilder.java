package builder;

public class MacbookBuilder extends Builder {

    private Computer mComputer = new MacBook();
    @Override
    public Builder buildBorad(String borad) {
        mComputer.setBorad(borad);
        return this;
    }

    @Override
    public Builder buildDisplay(String display) {
        mComputer.setDisplay(display);
        return this;
    }

    @Override
    public Builder buildOS() {
        mComputer.setOS();
        return this;
    }

    @Override
    public Computer create() {
        return mComputer;
    }
}
