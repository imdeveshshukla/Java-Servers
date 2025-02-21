import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
public class Server{
    public void run() throws IOException
    {
        int port = 8080;
        ServerSocket sock = new ServerSocket(port);
        sock.setSoTimeout(10000);
        while (true) {
            try {
                System.out.println("Server is Listening on Port"+port);
                Socket acc = sock.accept();
                System.out.println("Accepted Connection"+acc.getRemoteSocketAddress());
                PrintWriter toClient = new PrintWriter(acc.getOutputStream(),true);
                BufferedReader br = new BufferedReader(new InputStreamReader(acc.getInputStream()));
                toClient.println("Hello from the server");
                toClient.close();
                br.close();
                acc.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
        }

    }
    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}