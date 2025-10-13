package com.company.concreteComponent;

import com.company.IComponent.Coffee;

public class RegularCoffee implements Coffee {
    @Override
    public double cost() {
        return 1.5;
    }

    @Override
    public String description() {
        return "Regular Coffee";
    }
}
