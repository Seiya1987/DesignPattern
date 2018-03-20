package Decorator;

public class Client {

    public static void main(String[] args){
        Component component = new ConcreateCompoent();

        Decorator decorator = new ConcreateDecoratorA(component);
        decorator.operate();
    }

}
