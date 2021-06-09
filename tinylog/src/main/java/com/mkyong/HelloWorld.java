package com.mkyong;

import org.tinylog.Logger;

public class HelloWorld {

    // no need declare Logger, tinylog provide static Logger
    //private static Logger logger = Logger.getLogger(HelloWorld.class.getName());

    public static void main(String[] args) {

        Logger.info("Hello World TinyLog!");

        Logger.trace("This is trace!");

        Logger.debug("This is debug!");

        Logger.info("This is info!");

        Logger.warn("This is warn!");

        Logger.error("This is error!");

    }

}
