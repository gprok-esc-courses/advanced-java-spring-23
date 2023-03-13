package sockets.simple_chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.PrimitiveIterator;

public class Client {
    private Socket socket;
    private String ip = "127.0.0.1";
    private int port = 6002;
    private PrintWriter out;
    private BufferedReader in;

    public void start() {
        try {
            socket = new Socket(ip, port);
            System.out.println("Client started");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String msg = in.readLine();
            System.out.println(msg);
        } catch (IOException e) {
            System.out.println("IO problem, client could not start");
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
