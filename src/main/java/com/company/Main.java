package com.company;

import com.company.IComponent.Coffee;
import com.company.concreteComponent.AmericanoCoffee;
import com.company.concreteComponent.EspressoCoffee;
import com.company.concreteDecorator.*;

public class Main {
    public static void main(String[] args) {
        // Espresso Coffee
        Coffee espresso = new EspressoCoffee();
        System.out.println(espresso.description() + " Cost: " + espresso.cost());

        // Adding toppings
        espresso = new MilkDecorator(espresso);
        System.out.println(espresso.description() + " Cost: " + espresso.cost());

        espresso = new SugarDecorator(espresso);
        System.out.println(espresso.description() +  " Cost: " + espresso.cost());

        espresso = new WhippedCreamDecorator(espresso);
        System.out.println(espresso.description() +  " Cost: " + espresso.cost());

        System.out.println();

        // Americano Coffee
        Coffee americano = new AmericanoCoffee();
        System.out.println(americano.description() + " Cost: " + americano.cost());

        // Adding toppings
        americano = new SugarDecorator(americano);
        System.out.println(americano.description() +  " Cost: " + americano.cost());


    }
}