package com.mgacek.task1;

import java.util.List;

class Restaurant{
    private List<Cuisine> cuisineList;

    public List<Cuisine> getCuisineList() {
        return cuisineList;
    }

    public void setCuisineList(List<Cuisine> cuisineList) {
        this.cuisineList = cuisineList;
    }

    public Restaurant(List<Cuisine> cuisineList) {
        this.cuisineList = cuisineList;
    }
}