package designpatterns.structural.bridge;

public class RedColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling in red color");
    }
}