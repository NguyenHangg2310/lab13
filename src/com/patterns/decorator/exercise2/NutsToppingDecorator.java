package com.patterns.decorator.exercise2;

public class NutsToppingDecorator implements ToppingDecorator{
    IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String addTopping() {
        return "With nuts topping ";
    }

    @Override
    public String getDescription() {
        String result = iceCream.getDescription() + addTopping();
        return result;
    }
}
