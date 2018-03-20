package proxy;

public class ProxySubject extends Subject {
    private Subject subject;
    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    @Override
    public void visit() {
        System.out.println("This is Proxy");
        this.subject.visit();
    }
}
