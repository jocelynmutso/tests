package com.blobtestWeekBoundedCounter;

public class BoundedCounter {

  private int value;
  private int upperLimit;

  public BoundedCounter(int upperLimit) {
    this.upperLimit = upperLimit;

    }
       

  public void next() {
    if (value >= upperLimit) {
      value = 0;

    } else {
      value++;
    }

  }


  @Override
  public String toString() {
    return value + "";
  }

  }


