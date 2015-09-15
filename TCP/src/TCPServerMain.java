import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TCPServerMain {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1019);
        Socket socket = serverSocket.accept();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String message = reader.readLine();

        System.out.println("'ÁÖ¼Ò'>"+message);
    }
}
