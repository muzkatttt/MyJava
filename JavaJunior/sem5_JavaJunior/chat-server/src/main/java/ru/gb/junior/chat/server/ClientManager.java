package ru.gb.junior.chat.server;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class ClientManager implements Runnable {

    // region Поля
    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String name;
    public static ArrayList<ClientManager> clients = new ArrayList<>();
    private static HashMap<String, ClientManager> clientMap = new HashMap<>();

    // endregion


    // region Конструкторы
    public ClientManager(Socket socket) {
        try {
            this.socket = socket;
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            clients.add(this);
            //TODO: ...
            // i`ll be back...
            startListening();
            name = bufferedReader.readLine();
            clientMap.put(name, this);
            System.out.println(name + " подключился к чату");
            //broadcastMessage("Server: " + name + " подключился к чату."); // с семинара

        } catch (Exception e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    // endregion


    // region Методы

    private void startListening() {
        new Thread(() -> {
            try {
                String message;
                while ((message = bufferedReader.readLine()) != null) {
                    if (message.startsWith("@")) {
                        // Личное сообщение
                        String[] parts = message.split(" ", 2);
                        String recipient = parts[0].substring(1); // Получатель сообщения
                        String msg = parts[1];
                        sendPrivateMessage(recipient, msg);
                    } else {
                        // сообщение всем участникам, если оно не личное
                        broadcastMessage(name + ": " + message);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void sendPrivateMessage(String recipient, String message) {
        ClientManager recipientClient = clientMap.get(recipient);
        if (recipientClient != null && message.startsWith("@")) {
            try {
                recipientClient.bufferedWriter.write(recipient + " " + message + "\n");
                recipientClient.bufferedWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            // если получатель не найден
            System.out.printf("Участник чата не найден", recipient);
        }
    }

    private void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        // Удаление клиента из коллекции
        removeClient();
        try {
            // Завершаем работу буфера на чтение данных
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            // Завершаем работу буфера для записи данных
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            // Закрытие соединения с клиентским сокетом
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Удаление клиента из коллекции
     */
    private void removeClient() {
        clients.remove(this);
        System.out.println(name + " покинул чат.");
        broadcastMessage("Server: " + name + " покинул чат.");
    }


    /**
     * Отправка сообщения всем слушателям
     *
     * @param message сообщение
     */
    private void broadcastMessage(String message) {
        for (ClientManager client : clients) {
            try {
                if (!client.equals(this) && message != null) {
                    //if (!client.name.equals(name) && message != null) { // на семинаре
                    client.bufferedWriter.write(message);
                    client.bufferedWriter.newLine();
                    client.bufferedWriter.flush();
                }
            } catch (Exception e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
            }
        }
    }

    @Override
    public void run() {
        String messageFromClient;
        while (!socket.isClosed()) {
            try {
                // Чтение данных
                messageFromClient = bufferedReader.readLine();
                // отправка личных сообщений
                sendPrivateMessage(name, messageFromClient);

                // отправка сообщений всем участникам чата
                //broadcastMessage(messageFromClient);
            } catch (Exception e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
                //break;
            }
        }
    }

    // endregion
}

