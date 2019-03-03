package com.blobtestWeek4LyyraCard;

public class LyyraCard {

  private double balance;

  public LyyraCard(double balanceAtStart) {
    this.balance = balanceAtStart;
  }

  public void payEconomical() {
    if (this.balance > 2.50) {
      this.balance -= 2.50;
    } else {
      System.out.println("Insufficient funds " + " Your current balance is " + balance);
    }
    }

  public void payGourmet() {
    if (this.balance > 4.00) {
      this.balance -= 4.00;
    } else {
      System.out.println("Insufficient funds " + " Your current balance is " + balance);
    }
  }
    
  public void addMoney(double additionalMoney) {

    if (additionalMoney > 0) {
      this.balance += additionalMoney;

    } else if (additionalMoney > 150.00) {
      this.balance = 150.00;
    }
  }

  @Override
  public String toString() {
    return "LyyraCard [balance=" + balance + "]";
  }
}
