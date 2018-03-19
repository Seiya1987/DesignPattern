package visitor;

public class Enginner extends Staff {
    public Enginner(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProduct(){
        return 100;
    }
}
