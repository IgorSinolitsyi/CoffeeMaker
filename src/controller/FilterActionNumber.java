package controller;

import coffee_drinks.Cappuccino;
import coffee_drinks.Espresso;
import coffee_drinks.Latte;
import coffee_machine.CoffeeMachine;
import coffee_machine.ShowCoffeeMessage;

public class FilterActionNumber {

    public static void filterActionNumber(int option) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        switch (option) {
            case 1 -> {
                coffeeMachine.setCoffee(new Espresso());
            }
            case 2 -> {
                coffeeMachine.setCoffee(new Latte());
            }
            case 3 -> {
                coffeeMachine.setCoffee(new Cappuccino());
            }

            case 0 -> {
                System.exit(0);
            }
            default -> throw new IllegalStateException("Ошибка ввода: " + option);
        }
        ShowCoffeeMessage.show(coffeeMachine.makeCoffee());
    }
}
