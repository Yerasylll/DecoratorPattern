package com.company;

import com.company.IComponent.Coffee;
import com.company.concreteComponent.EspressoCoffee;
import com.company.concreteDecorator.*;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new EspressoCoffee();
        System.out.println(espresso.description() + " Cost: " + espresso.cost());

        espresso = new MilkDecorator(espresso);
        System.out.println(espresso.description() + " Cost: " + espresso.cost());

        espresso = new SugarDecorator(espresso);
        System.out.println(espresso.description() +  " Cost: " + espresso.cost());

        espresso = new WhippedCreamDecorator(espresso);
        System.out.println(espresso.description() +  " Cost: " + espresso.cost());
    }
}