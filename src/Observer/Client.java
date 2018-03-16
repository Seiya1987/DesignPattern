package Observer;

public class Client {

    public static void main(String[] args){
        ConcreateSubject subject = new ConcreateSubject();

        ConcreateObserver observer1 = new ConcreateObserver("Code 1");
        ConcreateObserver observer2 = new ConcreateObserver("Code 2");
        ConcreateObserver observer3 = new ConcreateObserver("Code 3");
        ConcreateObserver observer4 = new ConcreateObserver("Code 4");

        subject.addObserver(observer1);
        subject.addObserver(observer2);
        subject.addObserver(observer3);
        subject.addObserver(observer4);

        subject.notifyObservers("Hello world");
    }

}
