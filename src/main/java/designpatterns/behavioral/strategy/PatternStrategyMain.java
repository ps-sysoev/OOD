package designpatterns.behavioral.strategy;

public class PatternStrategyMain {
    public static void main(String[] args) {
        AudiCar audiA4 = new AudiA4();
        audiA4.performDrive();

        audiA4.setDrivable(new RearWheelDrive());
        audiA4.performDrive();
    }
}