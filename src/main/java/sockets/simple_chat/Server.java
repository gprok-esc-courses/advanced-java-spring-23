package sockets.simple_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private int port = 6002;
    private PrintWriter out;
    private BufferedReader in;

    public void start() {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Server started at " + port);
            while (true) {
                clientSocket = serverSocket.accept();
                System.out.println("New request");
                System.out.println(clientSocket);
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                out.println("Welcome to our server!");
            }
        }
        catch (IOException ioe) {
            System.out.println("IO problem, server failed to start");
        }
    }

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
}
