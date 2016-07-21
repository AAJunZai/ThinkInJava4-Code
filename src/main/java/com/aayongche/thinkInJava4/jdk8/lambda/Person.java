package com.aayongche.thinkInJava4.jdk8.lambda;

/**
 * Created by lyj on 16-6-22.
 */
public interface Person {
    long getId();

    default String getName() {
        return "yanjun.liu ";
    }
}

