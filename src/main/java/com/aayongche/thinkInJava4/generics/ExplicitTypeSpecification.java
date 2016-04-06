package com.aayongche.thinkInJava4.generics;//: generics/ExplicitTypeSpecification.java
import com.aayongche.thinkInJava4.typeinfo.pets.*;
import java.util.*;
import com.aayongche.thinkInJava4.net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
