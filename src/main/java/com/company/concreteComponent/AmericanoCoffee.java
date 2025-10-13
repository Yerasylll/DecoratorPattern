package com.company.concreteComponent;

import com.company.IComponent.Coffee;

public class AmericanoCoffee implements Coffee {

    @Override
    public double cost() {
        return 3.5;
    }

    @Override
    public String description() {
        return "Americano Coffee";
    }
}
