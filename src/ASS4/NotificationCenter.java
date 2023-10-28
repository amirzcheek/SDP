package ASS4;

import java.util.ArrayList;
import java.util.List;

public class NotificationCenter {

    List<IObserver> iObservers;

    public NotificationCenter() {
        iObservers = new ArrayList<>();
    }

    public void addObserver(IObserver iObserver) {
        iObservers.add(iObserver);
    }

    public void removeObserver(IObserver iObserver) {
        iObservers.remove(iObserver);
    }

    public void notifyObservers(String update) {
        for (IObserver iObserver : iObservers) {
            iObserver.update(update);
        }
    }

    public List<IObserver> getiObservers() {
        return iObservers;
    }
}
