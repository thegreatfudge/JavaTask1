package com.mgacek.task1;

class Food {
    public String name;
    public double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public java.lang.String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}