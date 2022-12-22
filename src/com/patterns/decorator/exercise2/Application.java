package com.patterns.decorator.exercise2;

public class Application {
    public static void main(String[] args) {
        IceCream iceCream = new ChocolateIceCream();
        IceCream chocolateWithToppingDecorator = new NutsToppingDecorator(new HoneyToppingDecorator(iceCream));
        System.out.println(chocolateWithToppingDecorator.getDescription());

        IceCream iceCream1 = new VanillaIceCream();
        IceCream vanillaWithToppingDecorator = new NutsToppingDecorator(iceCream1);
        System.out.println(vanillaWithToppingDecorator.getDescription());

        IceCream iceCream2 = new StrawberryIceCream();
        IceCream strawberryWithToppingDecorator = new HoneyToppingDecorator(iceCream2);
        System.out.println(strawberryWithToppingDecorator.getDescription());
    }
}
