package Decorator;

public class ConcreateDecoratorA extends Decorator {
    public ConcreateDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operate(){
        doSomethingA();
        super.operate();
        doSomethingB();
    }

    public void doSomethingA(){
        System.out.println("doSomethingA");
    }

    public void doSomethingB(){
        System.out.println("doSomethingB");
    }
}
