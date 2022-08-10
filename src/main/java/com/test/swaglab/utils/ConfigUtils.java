package com.test.swaglab.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ConfigUtils {
    static Properties prop = new Properties();

    public static void loadProperties() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            String confPath, msgPath, urlPath;

            if (os.startsWith("win")) {
                confPath = "\\src\\test\\resources\\config.properties";
                msgPath = "\\src\\test\\resources\\messages.properties";
                urlPath = "\\src\\test\\resources\\url.properties";
            } else {
                confPath = "/src/test/resources/config.properties";
                msgPath = "/src/test/resources/messages.properties";
                urlPath = "/src/test/resources/url.properties";
            }
            prop.load(new FileInputStream(System.getProperty("user.dir") + File.separator + confPath));
            prop.load(new FileInputStream(System.getProperty("user.dir") + File.separator + msgPath));
            prop.load(new FileInputStream(System.getProperty("user.dir") + File.separator + urlPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getPropertyByKey(String key) {
        return prop.getProperty(key);
    }
}
