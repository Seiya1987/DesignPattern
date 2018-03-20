package Composite;

public abstract class Componet {
    protected String name;
    public Componet(String name){
        this.name= name;
    }

    public abstract  void doSomething();
}
