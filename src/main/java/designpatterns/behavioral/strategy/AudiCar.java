package designpatterns.behavioral.strategy;

abstract class AudiCar {
    private Drivable drivable;

    public void setDrivable(Drivable drivable) {
        this.drivable = drivable;
    }

    public void performDrive() {
        drivable.drive();
    }
}