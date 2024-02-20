package ru.gb.junior.chat.server;

import java.io.IOException;
import java.net.ServerSocket;

public class Program {
    public static void main(String[] args) throws IOException {
        System.out.println("Привет, сервер!");
        ServerSocket serverSocket = new ServerSocket(4300);
        Server server = new Server(serverSocket);
        server.runServer();
    }
}
