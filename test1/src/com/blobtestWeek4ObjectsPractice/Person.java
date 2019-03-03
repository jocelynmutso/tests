package com.blobtestWeek4ObjectsPractice;

public class Person {

  private String name;
  private int age;
  private int weight;
  private int height;

  public Person(String nameAtStart) {
    this.age = 0;
    this.name = nameAtStart;
    this.weight = 0;
    this.height = 0;

  }

  public void setWeight(int newWeight) {
    this.weight = newWeight;

  }

  public void setHeight(int newHeight) {
    this.height = newHeight;

  }

  public double bodyMassIndex() {
    double heightDividedByHundred = this.height / 100;
    return this.weight / (heightDividedByHundred * heightDividedByHundred);
  }

  public String getName() {
    return this.name;
  }


  public void becomeOlder() {
    this.age++;
  }

  public boolean isAdult() {
    return this.age >= 18;
}

  @Override
  public String toString() {
    return this.name + " age " + this.age + " years";
  }

}
