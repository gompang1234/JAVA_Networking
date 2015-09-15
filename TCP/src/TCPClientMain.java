import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Mirim on 2015-09-15.
 */
public class TCPClientMain {
    public static void main(String[] args) throws IOException {
        String message = "";
        Scanner scanner = new Scanner(System.in);

        message=scanner.nextLine();

        Socket socket = new Socket("localhost",1019);

        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        writer.println(message);
    }
}
