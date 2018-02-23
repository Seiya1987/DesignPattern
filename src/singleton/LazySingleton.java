package singleton;

//懒汉模式
public class LazySingleton {
    private LazySingleton(){}

    private static LazySingleton instance = null;

    public static LazySingleton getInstance(){
        if(null == instance){
            instance = new LazySingleton();
        }
        return instance;
    }
}
