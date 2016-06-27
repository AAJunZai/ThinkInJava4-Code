package com.aayongche.thinkInJava4.jdk8.lambda;

/**
 * Created by lyj on 16-6-22.
 */
public interface Named {
    default String getName(){
        return "aaaa";
    }
}
