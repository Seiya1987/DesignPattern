package visitor;

public abstract class Staff {
    public String name;
    public int kpi;

    public Staff(String name){
        this.name = name;
    }

    public abstract void accept(Visitor visitor);
}
