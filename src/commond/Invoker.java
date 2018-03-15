package commond;

public class Invoker {
    private Commond commond;

    public Invoker(Commond commond){
        this.commond = commond;
    }

    public void action(){
        this.commond.execute();
    }

    public static void main(String[] args){
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker(new ConcreateCommond(receiver));
        invoker.action();
    }

}
