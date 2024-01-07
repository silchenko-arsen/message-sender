package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Reader {
    public void read(PrintWriter out) {
        try (
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        ){
            System.out.println("Підключено до сервера. Введіть повідомлення (або 'exit' для виходу):");
            String message;
            while (!(message = consoleReader.readLine()).equalsIgnoreCase("exit")) {
                    out.println(message);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

