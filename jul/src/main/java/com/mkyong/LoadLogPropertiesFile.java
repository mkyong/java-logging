package com.mkyong;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

// java server.jar -Djava.util.logging.config.file=/path/logging.properties
public class LoadLogPropertiesFile {

    static {
        // must set before the Logger
        String path = LoadLogPropertiesFile.class.getClassLoader().getResource("logging.properties").getFile();
        System.setProperty("java.util.logging.config.file", path);

        /*try (InputStream is = LoadLogPropertiesFile.class.getClassLoader().
                getResourceAsStream("logging.properties")) {
            LogManager.getLogManager().readConfiguration(is);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

    }

    private static Logger logger = Logger.getLogger(LoadLogPropertiesFile.class.getName());

    public static void main(String[] args) {

        // Log a info level msg
        logger.info("This is level info logging");

        logger.log(Level.SEVERE, "This is level severe logging");

        logger.log(Level.WARNING, "This is level warning logging");

        System.out.println("Hello Java Logging APIs.");
    }

}
