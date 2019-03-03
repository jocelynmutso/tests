package com.blobtestWeek4ObjectsPractice;

public class Product {

  String name;
  double price;
  double amount;
  int age;

  public Product(String nameAtStart, double priceAtStart, double amountAtStart, int ageAtStart) {
    this.name = nameAtStart;
    this.price = priceAtStart;
    this.amount = amountAtStart;
    this.age = ageAtStart;

  }

  public void becomeOlder() {
    this.age++;
  }

  public int getAge() {
    return this.age;
  }


  public void printProduct() {
    System.out
        .println("Product name: " + name + " Price: " + price + " Quantity: " + amount + " Shelf days old: " + age);
  }

}
