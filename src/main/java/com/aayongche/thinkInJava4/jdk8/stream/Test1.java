package com.aayongche.thinkInJava4.jdk8.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by lyj on 16-6-22.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        String contents=new String(Files.readAllBytes(Paths.get("/home/lyj/dos/workspace/java/ThinkInJava4-Code/src/main/java/com/aayongche/thinkInJava4/jdk8/stream/test1.txt")), StandardCharsets.UTF_8);
        List<String> words= Arrays.asList(contents.split("[\\p{L}]+"));
        long count=words.stream().filter(w->w.length()>1).count();
        System.out.println(count);

    }
}
