package visitor;

public class Coder extends Staff {
    public Coder(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return 10000000;
    }
}
