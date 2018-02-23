package singleton;

import java.io.ObjectStreamException;

//Double Check Lock
public class DCLSingleton {
    private DCLSingleton(){}

    private static volatile DCLSingleton instance = null;

    public static DCLSingleton getInstance(){
        if(null == instance){
            synchronized (DCLSingleton.class){
                if(null == instance){
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }

    //杜绝单利对象在被反序列化时重新生成对象
    private Object readResolve() throws ObjectStreamException {
        return instance;
    }
}
