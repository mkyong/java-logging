package com.mkyong;

import org.tinylog.Logger;

public class TagExample {

    public static void main(String[] args) {

        Logger.info("normal");

        // send to writer with tag `system`
        Logger.tag("system").error("this is system!");

        // send to writer with tag `api`
        Logger.tag("api").info("This is normal api log!");

    }

}
