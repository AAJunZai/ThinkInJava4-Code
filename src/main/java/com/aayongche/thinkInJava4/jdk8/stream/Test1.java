package com.aayongche.thinkInJava4.jdk8.stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by lyj on 16-6-22.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        List<String> words=new ArrayList<String>();
        words.add("aaa");
        words.add("qabc");
        words.add("zzbbbbbb");
        Optional<String> largest=words.stream().max(String::compareToIgnoreCase);
        if(largest.isPresent()){
            System.out.println("largest:"+largest.get());
        }

        largest.orElseGet(()->System.getProperty("user.dir"));
    }
}
