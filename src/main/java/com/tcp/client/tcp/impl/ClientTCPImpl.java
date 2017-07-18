package com.tcp.client.tcp.impl;

import com.tcp.client.tcp.ClientTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClientTCPImpl implements ClientTCP {

    private final static Logger LOGGER = Logger.getLogger(ClientTCP.class.getName());

    public Socket setSocket(String host, int port) {
        Socket socket = null;

        try {
            socket = new Socket(host, port);
            LOGGER.log(Level.INFO, "Клиентский сокет создан на хосте: " + host +
                    " и присоединен к порту: " + port);
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Клиентский токен не создан");
            e.printStackTrace();
        }

        return socket;
    }

    public OutputStream setOutputStream(Socket socket) {
        OutputStream outputStream = null;

        try {
            outputStream = socket.getOutputStream();
            LOGGER.log(Level.INFO, "Удалось получить стандартный поток вывода");
        } catch (IOException e) {
            e.printStackTrace();
            LOGGER.log(Level.WARNING, "Не удалось получить стандартный поток вывода");
        }

        return outputStream;
    }

    public void send(OutputStream outputStream) {

    }

}
