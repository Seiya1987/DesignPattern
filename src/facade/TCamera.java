package facade;

public class TCamera implements Camera {
    @Override
    public void open() {
        System.out.println("Camera open");
    }

    @Override
    public void takePicture() {
        System.out.println("Camera takePicture");
    }

    @Override
    public void close() {
        System.out.println("Camera close");
    }
}
