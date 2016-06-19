package com.mgacek.task1;

class Drink extends Food{
    private boolean withIce;
    private boolean withLemon;

    public Drink(String name, double price, boolean withIce, boolean withLemon) {
        super(name, price);
        this.withIce = withIce;
        this.withLemon = withLemon;
    }

    public boolean isWithIce() {
        return withIce;
    }

    public void setWithIce(boolean withIce) {
        this.withIce = withIce;
    }

    public boolean isWithLemon() {
        return withLemon;
    }

    public void setWithLemon(boolean withLemon) {
        this.withLemon = withLemon;
    }
}
