package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender {
    private static final int ZERO_INDEX = 0;
    private static final int FIRST_INDEX = 1;
    public void send(ConsoleReader reader, String[] properties) {
        try (Socket socket = new Socket(properties[ZERO_INDEX], Integer.parseInt(properties[FIRST_INDEX]));
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true)) {
            reader.read(printWriter);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

