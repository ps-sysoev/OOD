package designpatterns.behavioral.chain_of_responsibility;

public class Ir implements Image {
    @Override
    public String process() {
        return "IR";
    }
}