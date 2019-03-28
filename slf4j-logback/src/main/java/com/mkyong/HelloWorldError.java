package com.mkyong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldError {

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldError.class);

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
