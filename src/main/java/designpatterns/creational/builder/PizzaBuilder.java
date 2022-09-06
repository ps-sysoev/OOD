package designpatterns.creational.builder;

abstract class PizzaBuilder {
    protected Pizza pizza;

    Pizza getPizza() {
        return pizza;
    }

    void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    abstract void buildDough();

    abstract void buildSauce();

    abstract void buildTopping();
}