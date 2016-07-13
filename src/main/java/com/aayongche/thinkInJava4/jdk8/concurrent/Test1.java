package com.aayongche.thinkInJava4.jdk8.concurrent;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lyj on 16-7-12.
 */
public class Test1 {
    public static void main(String[] args) {
        ConcurrentHashMap<String,Integer> map=new ConcurrentHashMap();
        map.putIfAbsent("aaa",1);

        



    }
}
