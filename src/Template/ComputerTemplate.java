package Template;

public abstract class ComputerTemplate {

    protected void powerOn(){
        System.out.println("**************powerOn*******************");
    }

    protected void checkHardware(){
        System.out.println("**************checkHardware*******************");
    }

    protected void loadOS(){
        System.out.println("**************loadOS*******************");
    }

    protected void login(){
        System.out.println("**************login*******************");
    }

    public final void startUp(){
        System.out.println("**************start*******************");

        powerOn();
        checkHardware();
        loadOS();
        login();

        System.out.println("**************end*******************");
    }

}
