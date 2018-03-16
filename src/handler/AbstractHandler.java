package handler;

public abstract class AbstractHandler {
    protected AbstractHandler nextHandler;

    public final void handleRequest(AbstractRequest request){
        if(getHandleLevel() == request.getRequestLevel()){
            handle(request);
        }else{
            if(null != nextHandler){
                nextHandler.handleRequest(request);
            }else{
                System.out.println("The end");
            }
        }
    }

    protected abstract void handle(AbstractRequest request);

    protected abstract int getHandleLevel();

}
