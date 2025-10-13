package com.company.concreteComponent;

import com.company.IComponent.Coffee;

public class EspressoCoffee implements Coffee {
    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public String description() {
        return "Espresso Coffee";
    }
}
