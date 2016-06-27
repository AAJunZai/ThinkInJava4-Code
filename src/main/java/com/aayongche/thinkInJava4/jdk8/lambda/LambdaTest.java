package com.aayongche.thinkInJava4.jdk8.lambda;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Lambda 表达式
 * Created by lyj on 16-6-21.
 */
public class LambdaTest {
    //变量作用域
    public static void repeatMessage(String text, int count) {
        Runnable r = () -> {
            for (int i = 0; i < count; i++) {

                System.out.println(text);
                Thread.yield();
            }
        };
        new Thread(r).start();
    }

    public static void main(String[] args) {
        String[] strings = new String[]{"a", "cc", "bbb", "ddddd", "eeee"};
//        Arrays.sort(strings, new LengthComparator());
//        Arrays.sort(strings,(String first,String second)->Integer.compare(first.length(),second.length()));
       /* Arrays.sort(strings,(String first,String second)->{
            if(first.length()<second.length())
                return -1;
            else if(first.length()==second.length())
                return 1;
            else
                return 0;
        });*/
        /*Arrays.sort(strings, (first, second) -> {
            if (first.length() < second.length())
                return -1;
            else if (first.length() == second.length())
                return 1;
            else
                return 0;
        });*/
//        Arrays.sort(strings, String::compareToIgnoreCase);//方法引用
        Comparator.comparing(String::length);
        System.out.println(Arrays.toString(strings));
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return Integer.compare(first.length(), second.length());
    }
}