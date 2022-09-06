package designpatterns.structural.bridge;

public class BlackColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("Filling in black color");
    }
}