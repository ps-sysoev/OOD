package designpatterns.behavioral.chain_of_responsibility;

public class PatternChainOfResponsibilityMain {
    public static void main(String[] args) {
        Image[] inputImages = {
                new Ir(),
                new Ir(),
                new Ls(),
                new Ir(),
                new Ls(),
                new Ls(),
                new Ir(),
        };

        Processor[] processors = {
                new Processor(),
                new Processor(),
                new Processor()
        };

        for (int i = 0; i < inputImages.length; i++) {
            System.out.println("Operation #" + (i + 1) + ":");

            int j = 0;
            while (!processors[j].execute(inputImages[i])) {
                j = (j + 1) % processors.length;
            }

            System.out.println();
        }
    }
}