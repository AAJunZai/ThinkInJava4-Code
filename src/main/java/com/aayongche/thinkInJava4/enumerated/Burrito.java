//: enumerated/Burrito.java
package com.aayongche.thinkInJava4.enumerated;

public class Burrito {
  Spiciness degree;
  public Burrito(Spiciness degree) { this.degree = degree;}
  public String toString() { return "Burrito is "+ degree;}
  public static void main(String[] args) {
    System.out.println(new Burrito(Spiciness.NOT));
    System.out.println(new Burrito(Spiciness.MEDIUM));
    System.out.println(new Burrito(Spiciness.HOT));
  }
} /* Output:
Burrito is NOT
Burrito is MEDIUM
Burrito is HOT
*///:~
