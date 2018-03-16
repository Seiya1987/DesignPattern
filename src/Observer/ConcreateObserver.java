package Observer;

public class ConcreateObserver implements Observer {

    public String name;
    public ConcreateObserver(String name){
        this.name = name;
    }

    @Override
    public void update(Observer observer, Object tag) {
        System.out.println("Hi : "+ observer.toString() + "\t" + tag);
    }

    @Override
    public String toString() {
        return "Coding" + name;
    }
}
