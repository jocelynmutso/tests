package com.blobtestWeek4ObjectsPractice;

public class PersonMain {

  public static void main(String[] args) {
    Person bob = new Person("Bob");
    Person andy = new Person("Andy");

    int i = 0;
    while (i < 30) {
      bob.becomeOlder();
      i++;
    }

    andy.becomeOlder();
    System.out.println(andy);

    if (andy.isAdult()) {
      System.out.println(andy.getName() + " is an adult");
    } else {
      System.out.println(andy.getName() + " is a minor");
    }

    if (bob.isAdult()) {
      System.out.println(bob.getName() + " is an adult");
    } else {
      System.out.println(bob.getName() + " is a minor");
    }
    
    bob.setHeight(183);
    bob.setWeight(86);
    
    andy.setHeight(171);
    andy.setWeight(75);

    System.out.println(bob.getName() + " has a BMI of " + bob.bodyMassIndex());
    System.out.println(andy.getName() + " has a BMI of " + andy.bodyMassIndex());
  }

}
