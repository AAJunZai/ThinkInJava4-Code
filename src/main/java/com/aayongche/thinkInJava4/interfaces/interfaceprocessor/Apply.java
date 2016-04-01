//: interfaces/interfaceprocessor/Apply.java
package com.aayongche.thinkInJava4.interfaces.interfaceprocessor;
import static com.aayongche.thinkInJava4.net.mindview.util.Print.print;

public class Apply {
  public static void process(Processor p, Object s) {
    print("Using Processor " + p.name());
    print(p.process(s));
  }
} ///:~
