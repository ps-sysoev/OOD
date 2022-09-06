package designpatterns.behavioral.chain_of_responsibility;

import java.util.Random;

public class Processor {
    private static final Random RANDOM = new Random();
    private static int nextId = 1;
    private final int id = nextId++;

    public boolean execute(Image image) {
        if (RANDOM.nextInt(2) != 0) {
            System.out.println(" Processor " + id + " is busy.");

            return false;
        }

        System.out.println(" Processor " + id + " - " + image.process());

        return true;
    }
}