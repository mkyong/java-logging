package com.mkyong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorldError {

    private static final Logger logger = LogManager.getLogger(HelloWorldError.class);

    public static void main(String[] args) {

        try {
            System.out.println(getData());
        } catch (IllegalArgumentException e) {
            logger.error("{}", e);
        }

    }

    static int getData() throws IllegalArgumentException {
        throw new IllegalArgumentException("Sorry IllegalArgumentException!");
    }

}
