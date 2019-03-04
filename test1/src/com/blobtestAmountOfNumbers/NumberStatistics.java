package com.blobtestAmountOfNumbers;

public class NumberStatistics {

  int count = 0;
  private int sum;
  private int amountOfNumbers;

  public NumberStatistics() {
    this.amountOfNumbers = count;

  }

  public void addNumber(int number) {
    count++;

  }

  public int amountOfNumbers() {
    return count;

  }

  public int sum() {
    this.sum = amountOfNumbers + sum;
    return sum;

  }

  public double average() {
    return sum / amountOfNumbers;

  }
}
