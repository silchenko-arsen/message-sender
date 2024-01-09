package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleReader {

    public void read(PrintWriter printWriter) {
        try (
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        ){
            System.out.println("Connected to the server. Enter a message:");
            String message = consoleReader.readLine();
            printWriter.println(message);
        } catch (IOException e) {
            throw new DataProcessingException("Message not sent.", e);
        }
    }
}

