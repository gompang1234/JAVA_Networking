import java.io.IOException;
import java.net.Socket;

/**
 * Created by Mirim on 2015-09-21.
 */
public class TCPChatClientMain {

    public static void main(String[] args) throws IOException {
        //make socket
        String serverIp = "localhost";
        Socket socket;

        socket= new Socket(serverIp, 1116);

        //make sender
        Sender sender = new Sender(socket);
        sender.start();

        //make receiver
        Receiver receiver = new Receiver(socket);
        receiver.start();
    }
}
