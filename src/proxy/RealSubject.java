package proxy;

public class RealSubject extends Subject {
    @Override
    public void visit() {
        System.out.println("This is real subject");
    }
}
