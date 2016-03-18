//: annotations/Testable.java
package com.aayongche.thinkInJava4.annotations;

import com.aayongche.thinkInJava4.net.mindview.atunit.Test;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test
  void testExecute() { execute(); }
} ///:~
