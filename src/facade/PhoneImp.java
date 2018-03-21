package facade;

public class PhoneImp implements Phone{
    @Override
    public void dail() {
        System.out.println("dail");
    }

    @Override
    public void hangup() {
        System.out.println("hangup");
    }
}
