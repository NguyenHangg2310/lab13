package com.patterns.decorator.exercise2;

public class HoneyToppingDecorator implements ToppingDecorator{
    IceCream iceCream;

    public HoneyToppingDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    @Override
    public String addTopping() {
        return "With honey topping ";
    }

    @Override
    public String getDescription() {
        String result = iceCream.getDescription() + addTopping();
        return result;
    }
}
