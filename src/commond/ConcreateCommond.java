package commond;

public class ConcreateCommond implements Commond {
    private Receiver receiver;

    public ConcreateCommond(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.action();
    }
}
