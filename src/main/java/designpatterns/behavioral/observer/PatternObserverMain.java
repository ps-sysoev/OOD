package designpatterns.behavioral.observer;

public class PatternObserverMain {
    public static void main(String[] args) {
        Perseverance perseverance = new Perseverance();

        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(perseverance);
        PressureDisplay pressureDisplay = new PressureDisplay(perseverance);
        PhotoPublisher photoPublisher = new PhotoPublisher(perseverance);

        perseverance.onNewData(new PerseveranceData(-25, 0.6, "кратер Езеро"));
        System.out.println("--------------");

        perseverance.unregisterObserver(temperatureDisplay);

        perseverance.onNewData(new PerseveranceData(-35, 0.5, "море Дождей"));
    }
}