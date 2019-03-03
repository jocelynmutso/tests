package com.blobtestWeek4ObjectsMultiplier;

public class Main {

  public static void main(String[] args) {

    Multiplier tripleMultiplier = new Multiplier(3);
    System.out.println("Triple multiplication result: " + tripleMultiplier.multiply(2));

    Multiplier doubleMultiplier = new Multiplier(2);
    System.out.println("Double multiplication result: " + doubleMultiplier.multiply(2));

    Multiplier singleMultiplier = new Multiplier(1);
    System.out.println("Single multiplication result: " + singleMultiplier.multiply(1));

  }

}
