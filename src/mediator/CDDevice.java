package mediator;

public class CDDevice extends Colleague {
    private String data;//视频数据
    public CDDevice(Mediator mediator) {
        super(mediator);
    }

    public String read(){
        return data;
    }

    public void load(){
        data = "Video,Sound";
        mediator.changed(this);
    }
}
