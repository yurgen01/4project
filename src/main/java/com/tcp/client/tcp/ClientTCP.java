package com.tcp.client.tcp;

import java.io.OutputStream;
import java.net.Socket;

public interface ClientTCP {

    Socket setSocket(String host, int port);

    OutputStream setOutputStream(Socket socket);

    void send(OutputStream outputStream);

}
