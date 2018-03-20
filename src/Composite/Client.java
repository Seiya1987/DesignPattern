package Composite;

public class Client {

    public static void main(String[] args){
        Composite root = new Composite("Root");

        Composite branch1 = new Composite("Branch1");
        Composite branch2 = new Composite("Branch2");

        Leaf leaf1 = new Leaf("leaf1");
        Leaf leaf2 = new Leaf("leaf2");

        root.addChild(branch1);
        root.addChild(branch2);

        branch1.addChild(leaf1);
        branch2.addChild(leaf2);

        root.doSomething();
    }

}
