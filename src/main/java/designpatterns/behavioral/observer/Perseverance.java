package designpatterns.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class Perseverance implements Subject {
    private PerseveranceData data;
    private final Set<Observer> observerSet = new HashSet<>();

    public PerseveranceData getData() {
        return data;
    }

    public void onNewData(PerseveranceData newData) {
        data = newData;

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerSet.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerSet) {
            observer.update(data);
        }
    }
}