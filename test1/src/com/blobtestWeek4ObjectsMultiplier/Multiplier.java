package com.blobtestWeek4ObjectsMultiplier;

public class Multiplier {

  int number;
  int otherNumber;
  
 public Multiplier (int number) {
   this.number = number;
  }
 
 public int multiply(int otherNumber) {
   this.otherNumber = otherNumber;
   int result = 0;
   result = number * otherNumber;
   return result;
 }
 
  public void printResult() {
    System.out.print(number * otherNumber);
  }
}
  

  
  





