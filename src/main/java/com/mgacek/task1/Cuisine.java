package com.mgacek.task1;

import java.util.List;

class Cuisine{
	private String nameOfCuisine;
	private List<Dinner> mealList;
	private List<Dessert> dessertList;

	public Cuisine() {
		super();
	}

	public Cuisine(String nameOfCuisine, List<Dinner> mealList, List<Dessert> dessertList) {
		this.nameOfCuisine = nameOfCuisine;
		this.mealList = mealList;
		this.dessertList = dessertList;
	}

	public String getNameOfCuisine() {
		return nameOfCuisine;
	}

	public void setNameOfCuisine(String nameOfCuisine) {
		this.nameOfCuisine = nameOfCuisine;
	}

	public List<Dinner> getMealList() {
		return mealList;
	}

	public void setMealList(List<Dinner> mealList) {
		this.mealList = mealList;
	}

	public List<Dessert> getDessertList() {
		return dessertList;
	}

	public void setDessertList(List<Dessert> dessertList) {
		this.dessertList = dessertList;
	}
}
