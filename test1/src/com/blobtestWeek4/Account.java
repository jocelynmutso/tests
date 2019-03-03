package com.blobtestWeek4;

public class Account {

  private String name;

  @Override
  public String toString() {
    return name + ", balance=" + balance;
  }

  private double balance;

  public Account(String name, double balance) {
    super();
    this.name = name;
    this.balance = balance;
  }

  public void withdrawal(double value) {
    balance = balance - value;
  }

  public void deposit(double value) {
    balance = balance + value;
  }

  public void withdrawal(int value) {
    balance = balance - value;
  }

  public void deposit(int value) {
    balance = balance + value;
  }

  public double balance() {
    return balance;
  }

}
