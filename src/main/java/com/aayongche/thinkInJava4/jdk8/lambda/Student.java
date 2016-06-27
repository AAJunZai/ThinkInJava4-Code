package com.aayongche.thinkInJava4.jdk8.lambda;

import java.util.Comparator;

/**
 * Created by lyj on 16-6-22.
 */
public class Student implements Person,Named{

    @Override
    public long getId() {
        return 0;
    }

    @Override
    public String getName() {
        return Person.super.getName();
    }


}
