package com.mgacek.task1;

class Dinner extends Food{

    private boolean isVegetarian;

    public Dinner(String name, double price, boolean isVegetarian) {
        super(name, price);
        this.isVegetarian = isVegetarian;
    }
}