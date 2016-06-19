package com.mgacek.task1;

class Dessert extends Food{
    private int calories;

    public Dessert(String name, double price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}