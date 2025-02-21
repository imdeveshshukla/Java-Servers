import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public void run() throws IOException, UnknownHostException
    {
        int port = 8080;
        InetAddress address = InetAddress.getByName("localhost");
        Socket socket = new Socket(address,port);
        PrintWriter toSocket = new PrintWriter(socket.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line = br.readLine();
        System.out.println("Response from Server is = "+line);
        
        toSocket.close();
        br.close();
        socket.close();

    }
    public static void main(String[] args) {
        Client cli = new Client();
        try {
            cli.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
