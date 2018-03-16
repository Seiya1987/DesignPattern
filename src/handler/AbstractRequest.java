package handler;

public abstract class AbstractRequest {
    private Object obj;

    public AbstractRequest(Object obj){
        this.obj = obj;
    }

    public void setObj(Object obj){
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public abstract int getRequestLevel();

}
