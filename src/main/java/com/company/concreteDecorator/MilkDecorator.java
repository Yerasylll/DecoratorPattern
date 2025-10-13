package com.company.concreteDecorator;

import com.company.IComponent.Coffee;
import com.company.decorator.CoffeeDecorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 0.5;
    }

    @Override
    public String description() {
        return decoratedCoffee.description() + ", Milk";
    }
}
