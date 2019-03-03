package com.blobtestWeek4;

public class AccountTest {

  public static void main(String[] args) {

    Account a = new Account("accountA", 100.0);
    Account b = new Account("accountB", 0.0);
    Account c = new Account("accountC", 0.0);

    transfer(a, b, 50.0);
    transfer(b, c, 25.0);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
  }

  public static void transfer(Account from, Account to, double howMuch) {
    from.withdrawal(howMuch);
    to.deposit(howMuch);



    Account mattsAccount = new Account("mattsAccount", 1000);
    Account myAccount = new Account("myAccount", 0);
    mattsAccount.withdrawal(100.0);
    mattsAccount.balance();
    myAccount.deposit(100.0);
    System.out.println(mattsAccount.toString());
    System.out.println(myAccount.toString());

  }
}
