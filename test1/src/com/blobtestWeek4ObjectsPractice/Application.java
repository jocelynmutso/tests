package com.blobtestWeek4ObjectsPractice;

public class Application {

  public static void main(String[] args) {
    Product banana = new Product("banana ", 2.30, 9.0, 3);
    Product grapes = new Product("grapes", 3.50, 10, 4);
    Product apple = new Product("apple", 1.25, 36, 1);

    banana.printProduct();
    grapes.printProduct();
    apple.printProduct();

    banana.becomeOlder();
    banana.becomeOlder();

    System.out.println(" ");

    banana.printProduct();
    grapes.printProduct();
    apple.printProduct();

    System.out.println("Current age of banana in days: " + banana.getAge());

  }
}

