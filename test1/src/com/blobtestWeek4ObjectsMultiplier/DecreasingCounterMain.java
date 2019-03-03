package com.blobtestWeek4ObjectsMultiplier;

public class DecreasingCounterMain {

  public static void main(String[] args) {
    DecreasingCounter counter = new DecreasingCounter(100);

    counter.printValue();

    counter.decrease();
    counter.printValue();

    counter.reset();
    counter.printValue();

    counter.setInitial();
    counter.printValue();
  }

}
