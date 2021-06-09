package com.mkyong;

import org.tinylog.Logger;

public class LogWithException {

    public static void main(String[] args) {

        try {
            int answer = 1 / 0;
            System.out.println(answer);
        } catch (Exception ex) {
            Logger.error(ex);
        }

    }

}
