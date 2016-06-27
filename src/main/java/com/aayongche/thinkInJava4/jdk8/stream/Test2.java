package com.aayongche.thinkInJava4.jdk8.stream;


import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * Created by lyj on 16-6-22.
 */
public class Test2 {
    public static void main(String[] args) {

        Stream<Double> randoms= Stream.generate(Math::random).limit(100);
        Object[] obj=randoms.toArray();
        System.out.println(Arrays.toString(obj));


    }
}