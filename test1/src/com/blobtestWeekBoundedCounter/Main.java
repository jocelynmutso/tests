package com.blobtestWeekBoundedCounter;

public class Main {

  public static void main(String[] args) {

    BoundedCounter counter = new BoundedCounter(4);
    System.out.println("Value at start: " + counter);
    int index = 0;
    int i = 0;
    while (i < 10) {
      index++;
      counter.next();
      System.out.println("Value: " + counter);
      i++;
    }

  }

}
