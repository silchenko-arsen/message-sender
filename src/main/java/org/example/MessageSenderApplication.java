package org.example;

public class MessageSenderApplication {
    public static void main(String[] args) {
        ConfigReader configReader = new ConfigReader();
        String[] properties = configReader.readProperties();
        ConsoleReader reader = new ConsoleReader();
        Sender server = new Sender();
        server.send(reader, properties);
    }
}
