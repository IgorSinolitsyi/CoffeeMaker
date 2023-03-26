package coffee_machine;

import coffee_drinks.Coffee;

public class CoffeeMachine {

    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public String makeCoffee() {
        return coffee.make();
    }
}
