package com.aayongche.thinkInJava4.jdk8.stream;

import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by lyj on 16-6-30.
 */
public class Test3 {
    public static void main(String[] args) {


    }

    public static void info(Logger logger, Supplier<String> message) {
        if (logger.isLoggable(Level.INFO)) {
            logger.info(message.get());
        }
    }


}
