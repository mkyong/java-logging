package com.mkyong;

import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld {

    private static Logger logger = Logger.getLogger(HelloWorld.class.getName());

    public static void main(String[] args) {

        // set log level to SEVERE, default level info
        logger.setLevel(Level.SEVERE);

        // Log a info level msg
        logger.info("This is level info logging");

        logger.log(Level.WARNING, "This is level warning logging");

        logger.log(Level.SEVERE, "This is level severe logging");

        System.out.println("Hello Java Logging APIs.");
    }

}
