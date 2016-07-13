package com.aayongche.thinkInJava4.jdk8.time;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by lyj on 16-7-8.
 */
public class Test1 {
    public static void main(String[] args) {
        /*Instant start=Instant.now();
        for(int i=0;i<100000;i++){
            int a=1;
        }
        Instant end=Instant.now();
        Duration timeElapsed= Duration.between(start,end);
        long millis=timeElapsed.toMillis();
        System.out.println(millis);*/

        LocalDate today= LocalDate.now();
        System.out.println(today.plusDays(1).toString());
        System.out.println(today.toString());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getDayOfWeek());

        
    }
}
