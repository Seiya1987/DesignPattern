package handler;

public class Handler1 extends AbstractHandler {
    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("request level: "+ request.getRequestLevel());
    }

    @Override
    protected int getHandleLevel() {
        return 1;
    }
}
