package singleton;

import java.io.ObjectStreamException;

//推荐使用
//静态内部类实现单例
public class StaticInnerSingleton {
    private StaticInnerSingleton(){}

    public static StaticInnerSingleton getInstace(){
        return SingletonHolder.instance;
    }

    private static class SingletonHolder{
        private static final StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    //杜绝单利对象在被反序列化时重新生成对象
    private Object readResolve() throws ObjectStreamException{
        return SingletonHolder.instance;
    }
}
