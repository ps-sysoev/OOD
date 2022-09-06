package designpatterns.behavioral.observer;

public class PerseveranceData {
    private final double temperature;
    private final double pressure;
    private final String photo;

    public PerseveranceData(double temperature, double pressure, String photo) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.photo = photo;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getPressure() {
        return pressure;
    }

    public String getPhoto() {
        return photo;
    }
}