package designpatterns.creational.builder;

public class PizzaBuilderMain {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        waiter.setPizzaBuilder(hawaiianPizzaBuilder);
        waiter.constructPizza();

        Pizza pizzaOne = waiter.getPizza();
        System.out.println(pizzaOne);

        waiter.setPizzaBuilder(spicyPizzaBuilder);
        waiter.constructPizza();

        Pizza pizzaTwo = waiter.getPizza();
        System.out.println(pizzaTwo);
    }
}