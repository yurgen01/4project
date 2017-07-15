package com.tcp.server.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public interface ServerTCP {

    ServerSocket setServerSocket(int port);

    Socket setSocket(ServerSocket serverSocket);

    InputStream setInputStream(Socket socket);

    void listen(InputStream inputStream);

}
