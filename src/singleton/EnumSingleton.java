package singleton;

public enum EnumSingleton {
    INSTANCE;

    private Resource instance;
    EnumSingleton(){
        instance = new Resource();
    }

    public Resource getInstance() {
        return instance;
    }
}
