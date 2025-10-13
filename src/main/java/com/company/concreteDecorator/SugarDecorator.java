package com.company.concreteDecorator;

import com.company.IComponent.Coffee;
import com.company.decorator.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return super.cost() + 0.4;
    }

    @Override
    public String description() {
        return super.description() + ", Sugar";
    }
}
