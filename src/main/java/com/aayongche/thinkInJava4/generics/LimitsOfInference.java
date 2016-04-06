package com.aayongche.thinkInJava4.generics;//: generics/LimitsOfInference.java
import com.aayongche.thinkInJava4.typeinfo.pets.*;
import java.util.*;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
