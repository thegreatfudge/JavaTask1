package com.mgacek.task1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double toPay = 0;
        //Prepare food for Polish cuisine
        Dinner polishMeal1 = new Dinner("Danie1", 15.00, false);
        Dinner polishMeal2 = new Dinner("Danie2", 13.00, false);
        Dinner polishMeal3 = new Dinner("Danie3", 9.00, true);

        Dessert polishDessert1 = new Dessert("Deser1", 5.00, 400);
        Dessert polishDessert2 = new Dessert("Deser2", 7.00, 500);
        Dessert polishDessert3 = new Dessert("Deser3", 4.50, 200);

        //Prepare food for Italian cuisine
        Dinner italianMeal1 = new Dinner("Piatto1", 11.00, false);
        Dinner italianMeal2 = new Dinner("Piatto2", 12.00, false);
        Dinner italianMeal3 = new Dinner("Piatto3", 12.50, true);

        Dessert italianDessert1 = new Dessert("Piatto1", 7.00, 400);
        Dessert italianDessert2 = new Dessert("Piatto2", 8.00, 500);
        Dessert italianDessert3 = new Dessert("Piatto3", 1.50, 200);

        //Prepare food for Mexican cuisine
        Dinner mexicanMeal1 = new Dinner("Plato1", 11.00, false);
        Dinner mexicanMeal2 = new Dinner("Plato2", 12.00, false);
        Dinner mexicanMeal3 = new Dinner("Plato3", 12.50, true);

        Dessert mexicanDessert1 = new Dessert("Postre1", 7.00, 400);
        Dessert mexicanDessert2 = new Dessert("Postre2", 8.00, 500);
        Dessert mexicanDessert3 = new Dessert("Postre3", 1.50, 200);

        //Opening Polish Cuisine
        List<Dinner> polishMeals = new ArrayList<>();
        polishMeals.add(polishMeal1);
        polishMeals.add(polishMeal2);
        polishMeals.add(polishMeal3);
        List<Dessert> polishDesserts = new ArrayList<>();
        polishDesserts.add(polishDessert1);
        polishDesserts.add(polishDessert2);
        polishDesserts.add(polishDessert3);
        Cuisine polishCuisine = new Cuisine("Polish", polishMeals, polishDesserts);

        //Opening Italian Cuisine
        List<Dinner> italianMeals = new ArrayList<>();
        italianMeals.add(italianMeal1);
        italianMeals.add(italianMeal2);
        italianMeals.add(italianMeal3);
        List<Dessert> italianDesserts = new ArrayList<>();
        italianDesserts.add(italianDessert1);
        italianDesserts.add(italianDessert2);
        italianDesserts.add(italianDessert3);
        Cuisine italianCuisine = new Cuisine("Italian", italianMeals, italianDesserts);

        //Opening Mexican Cuisine
        List<Dinner> mexicanMeals = new ArrayList<>();
        mexicanMeals.add(mexicanMeal1);
        mexicanMeals.add(mexicanMeal2);
        mexicanMeals.add(mexicanMeal3);
        List<Dessert> mexicanDesserts = new ArrayList<>();
        mexicanDesserts.add(mexicanDessert1);
        mexicanDesserts.add(mexicanDessert2);
        mexicanDesserts.add(mexicanDessert3);
        Cuisine mexicanCuisine = new Cuisine("Mexican", mexicanMeals, mexicanDesserts);

        List<Cuisine> cuisineList = new ArrayList<>();
        cuisineList.add(polishCuisine);
        cuisineList.add(italianCuisine);
        cuisineList.add(mexicanCuisine);

        Restaurant restaurant = new Restaurant(cuisineList);

        System.out.println("Welcome to our restaurant! Would you like to: ");
        System.out.println("1. Order drink");
        System.out.println("2. Order lunch");
        int decision = in.nextInt();
        Lunch lunch = null;
        switch(decision){
            case 1:
                int withLemon;
                System.out.println("Would like to add: ");
                System.out.println("1. Ice");
                System.out.println("2. Lemon");
                System.out.println("3. Both");
                Food drink = null;
                withLemon = in.nextInt();
                if(withLemon == 1)
                    drink = new Drink("Drink", 1.25, true, false);
                else if(withLemon == 2)
                    drink = new Drink("Drink", 1.50, false, true);
                else if(withLemon == 3)
                    drink = new Drink("Drink", 1.75, true, true);
                toPay += drink.getPrice();
                break;
            case 2:
                int choosenCuisine, choosenLunch, choosenDessert;
                System.out.println("MENU:");
                System.out.println("Pick cuisine: ");
                for(int i=0; i<restaurant.getCuisineList().size(); i++){
                    System.out.println((i+1) + ". " + restaurant.getCuisineList().get(i).getNameOfCuisine());
                }
                choosenCuisine = in.nextInt();

                System.out.println("Pick you dinner: ");
                for(int i=0; i<restaurant.getCuisineList().get(choosenCuisine).getMealList().size(); i++){
                    System.out.println((i+1) + ". " + restaurant.getCuisineList().get(choosenCuisine).getMealList().get(i).getName() + " - " +
                            restaurant.getCuisineList().get(choosenCuisine).getMealList().get(i).getPrice() + " zl");
                }
                choosenLunch = in.nextInt();

                System.out.println("Pick you dessert: ");
                for(int i=0; i<restaurant.getCuisineList().get(choosenCuisine).getMealList().size(); i++){
                    System.out.println((i+1) + ". " + restaurant.getCuisineList().get(choosenCuisine).getDessertList().get(i).getName()
                            + "(" + restaurant.getCuisineList().get(choosenCuisine).getDessertList().get(i).getCalories() + " kcal) - "
                            + restaurant.getCuisineList().get(choosenCuisine).getDessertList().get(i).getPrice() + " zl");
                }
                choosenDessert = in.nextInt();
                lunch = new Lunch(restaurant.getCuisineList().get(choosenCuisine).getMealList().get(choosenLunch-1),
                        restaurant.getCuisineList().get(choosenCuisine).getDessertList().get(choosenDessert-1));
                break;
            default:
                System.out.println("There is no such option!");
                break;
        }


        System.out.println(lunch);
        toPay += lunch.getLunch().getPrice() + lunch.getDessert().getPrice();
        System.out.println("Thank you for eating in our restaurant!");
        System.out.println("Your bill: " + toPay + "zl");
    }
}