//: annotations/database/Uniqueness.java
// Sample of nested annotations
package com.aayongche.thinkInJava4.annotations.database;

public @interface Uniqueness {
  Constraints constraints()
    default @Constraints(unique=true);
} ///:~
