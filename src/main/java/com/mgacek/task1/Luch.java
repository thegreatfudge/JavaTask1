package com.mgacek.task1;

class Lunch{
    private Dinner lunch;
    private Dessert dessert;

    public Lunch(Dinner lunch, Dessert dessert) {
        this.lunch = lunch;
        this.dessert = dessert;
    }

    public Dinner getLunch() {
        return lunch;
    }

    public void setLunch(Dinner lunch) {
        this.lunch = lunch;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public java.lang.String toString() {
        return "Your lunch consists of dinner " + lunch.getName() + " and dessert " + dessert.getName();
    }
}