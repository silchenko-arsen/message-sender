package org.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender {
    private final static String SERVER_ADDRESS = "localhost";
    private final static int PORT_NUMBER = 8081;
    private final Reader reader;

    public Sender() {
        this.reader = new Reader();
    }

    public void send() {
        try (
                Socket socket = new Socket(SERVER_ADDRESS, PORT_NUMBER);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ) {
            reader.read(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
