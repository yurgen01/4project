package com.tcp.server.tcp.impl;

import com.tcp.server.tcp.ServerTCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServerTCPImpl implements ServerTCP {

    private final static Logger LOGGER = Logger.getLogger(ServerTCP.class.getName());

    public ServerSocket setServerSocket(int port) {
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket(port);
            LOGGER.log(Level.INFO, "Серверный сокет установился на порт: " + port);
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Серверный сокет не создался");
            e.printStackTrace();
        }

        return serverSocket;
    }

    public Socket setSocket(ServerSocket serverSocket) {
        Socket socket = null;

        try {
            socket = serverSocket.accept();
            LOGGER.log(Level.INFO, "Получение клиентского сокета прошло успешно");
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Что-то пошло не так во время получения клиентского сокета");
            e.printStackTrace();
        }

        return socket;
    }

    public InputStream setInputStream(Socket socket) {
        InputStream inputStream = null;

        try {
            inputStream = socket.getInputStream();
            LOGGER.log(Level.INFO, "Мы получили стандартный поток ввода");
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Не удалось получить стандартный поток ввода");
            e.printStackTrace();
        }

        return inputStream;
    }

    public void listen(InputStream inputStream) {

    }
}
