package com.aayongche.thinkInJava4.generics;//: generics/SimplerPets.java
import com.aayongche.thinkInJava4.typeinfo.pets.*;
import java.util.*;
import com.aayongche.thinkInJava4.net.mindview.util.*;

public class SimplerPets {
  public static void main(String[] args) {
    Map<Person, List<? extends Pet>> petPeople = New.map();
    // Rest of the code is the same...
  }
} ///:~
