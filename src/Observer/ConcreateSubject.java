package Observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreateSubject implements Subject {

    List<Observer> list = new ArrayList<>();
    public void addObserver(Observer observer){
        list.add(observer);
    }

    @Override
    public void notifyObservers(String content) {
        for(Observer observer : list){
            observer.update(observer, content);
        }
    }
}
