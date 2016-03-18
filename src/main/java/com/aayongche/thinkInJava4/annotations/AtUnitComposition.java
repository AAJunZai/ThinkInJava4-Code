//: annotations/AtUnitComposition.java
// Creating non-embedded tests.
package com.aayongche.thinkInJava4.annotations;
import com.aayongche.thinkInJava4.net.mindview.atunit.Test;
import com.aayongche.thinkInJava4.net.mindview.util.OSExecute;

public class AtUnitComposition {
  AtUnitExample1 testObject = new AtUnitExample1();
  @Test
  boolean _methodOne() {
    return
      testObject.methodOne().equals("This is methodOne");
  }
  @Test boolean _methodTwo() {
    return testObject.methodTwo() == 2;
  }
  public static void main(String[] args) throws Exception {
    OSExecute.command(
     "java net.mindview.atunit.AtUnit AtUnitComposition");
  }
} /* Output:
annotations.AtUnitComposition
  . _methodOne
  . _methodTwo This is methodTwo

OK (2 tests)
*///:~
