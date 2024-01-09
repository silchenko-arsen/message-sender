package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public class ConfigReader {
    private static final String PROPERTIES_FILE = "application.properties";
    private static final String SERVER_PORT = "server.port";
    private static final String SERVER_ADDRESS = "server.address";

    public String[] readProperties() {
        Properties properties = new Properties();
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream(PROPERTIES_FILE)) {
            properties.load(input);
        } catch (IOException e) {
            throw new FileNotFoundException("File with configuration didn't find.", e);
        }
        return new String[]{properties.getProperty(SERVER_ADDRESS), properties.getProperty(SERVER_PORT)};
    }
}
