package com.blobtestWeek4LyyraCard;

public class Main {

  public static void main(String[] args) {

    LyyraCard card = new LyyraCard(10.00);
    System.out.println(card);

    card.addMoney(-15);
    System.out.println(card);

    card.payEconomical();
    System.out.println(card);

    card.addMoney(50);
    System.out.println(card);

    card.payGourmet();

    System.out.println(card);

    card.addMoney(150.00);
    System.out.println(card);

    LyyraCard cardPekka = new LyyraCard(20);
    LyyraCard cardBrian = new LyyraCard(30);

    cardPekka.payGourmet();
    cardBrian.payEconomical();

    System.out.println("Pekkas card has: " + cardPekka);
    System.out.println("Brians card has: " + cardBrian);

    cardPekka.addMoney(20);
    cardBrian.payGourmet();

    System.out.println("Pekkas card has: " + cardPekka);
    System.out.println("Brians card has: " + cardBrian);

    cardPekka.payEconomical();
    cardPekka.payEconomical();
    cardBrian.addMoney(50);

    System.out.println("Pekkas card has: " + cardPekka);
    System.out.println("Brians card has: " + cardBrian);

  }

}
