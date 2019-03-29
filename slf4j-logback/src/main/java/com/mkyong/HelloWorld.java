package com.mkyong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {

        logger.debug("Hello from Logback");

        //while (true)//test rotate file
        logger.debug("getNumber() : {}", getNumber());

    }

    static int getNumber() {
        return 5;
    }

}
