package com.blobtestWeek4ObjectsMultiplier;

public class MenuMain {

  public static void main(String[] args) {

    Menu meals = new Menu();

    meals.addMeal("hamburger");
    meals.addMeal("pizza");
    meals.addMeal("soup");
    meals.addMeal("soup");

    System.out.println(meals);

    meals.printMeals();

    meals.clearMenu();

    meals.printMeals();

  }


}
