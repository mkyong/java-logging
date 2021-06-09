package com.mkyong;

import org.tinylog.Logger;

public class LogWithArguments {
    
    public static void main(String[] args) {

        String msg = "info";
        int number = 9;

        Logger.info("This is {}, {}", msg, number);

        Logger.error("This is {}", "error");

    }

}
