package com.company.concreteDecorator;

import com.company.IComponent.Coffee;
import com.company.decorator.CoffeeDecorator;

public class WhippedCreamDecorator extends CoffeeDecorator {

    public WhippedCreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.2;
    }

    @Override
    public String description() {
        return super.description() + ", Whipped Cream";
    }
}
