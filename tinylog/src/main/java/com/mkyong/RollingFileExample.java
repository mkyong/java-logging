package com.mkyong;

import org.tinylog.Logger;

public class RollingFileExample {

    public static void main(String[] args) {

        // create hello x 3 per line
        String line = "Hello tinylog! ";
        line = line + line + line;

        System.out.println(line);

        int count = 0;
        while (count < 100_000) {
            Logger.info(line + count);
            count++;
        }

        System.out.println("Done");
    }

}
