package facade;

public class MobilePhone {
    private Phone phone = new PhoneImp();
    private Camera camera = new TCamera();

    public void dail(){
        phone.dail();
    }

    public void videoChat(){
        camera.open();
        phone.dail();
    }

    public void hangup(){
        phone.hangup();
    }

    public void tackePicture(){
        camera.takePicture();
    }

    public void closeCamera(){
        camera.close();
    }
}
