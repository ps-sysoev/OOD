package designpatterns.behavioral.observer;

public class PressureDisplay implements Observer {
    public PressureDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(PerseveranceData data) {
        System.out.printf("Давление на Марсе - %3.1f кПа %n", data.getPressure());
    }
}