package com.blobtestWeek4ObjectsMultiplier;
import java.util.ArrayList;

public class Menu {
  private final ArrayList<String> meals = new ArrayList<>();


  public void addMeal(String meal) {

    if (!meals.contains(meal)) {
      this.meals.add(meal);
    }
  }
  public void printMeals() {
    for (String meal : meals) {
      System.out.println(meal);
    }
  }

  public void clearMenu() {
    meals.clear();
  }

  @Override
  public String toString() {
    return "Menu [meals=" + meals + "]";
  }

}
