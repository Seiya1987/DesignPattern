package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Componet {
    private List<Componet> componets = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSomething() {
        System.out.println(name);
        if(null != componets){
            for(Componet componet : componets){
                componet.doSomething();
            }
        }
    }

    public void addChild(Componet child){
        componets.add(child);
    }

    public void removeChild(Componet child){
        componets.remove(child);
    }

    public Componet getChildren(int index){
        return componets.get(index);
    }
}
