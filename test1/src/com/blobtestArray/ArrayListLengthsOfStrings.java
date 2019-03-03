package com.blobtestArray;

import java.util.ArrayList;

public class ArrayListLengthsOfStrings {

  public static ArrayList<Integer> lengths(ArrayList<String> list) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    for (String word : list) {
      result.add(word.length());
    }
    return result;
  }

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    list.add("Hallo");
    list.add("Moi");
    list.add("Benvenuto!");
    list.add("badger badger badger badger");
    ArrayList<Integer> lengths = lengths(list);

    System.out.println("The lengths of the Strings: " + lengths);
  }

}
