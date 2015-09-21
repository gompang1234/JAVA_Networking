import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Mirim on 2015-09-10.
 */
public class UDPServerMain {
    public static void main(String[] args) throws IOException {


        DatagramSocket ds = new DatagramSocket(1226);
        //make socket
        while(true){

            byte[] data = new byte[1024];


            DatagramPacket dp = new DatagramPacket(data, data.length);


            System.out.println("UDP Server standby...");
            ds.receive(dp);


            String address= dp.getAddress().toString();
            String message = new String(dp.getData());

            System.out.println(address+">"+message);
            if(message.equalsIgnoreCase("bye")){
                break;
            }
        }

        //make packet

        //receive

        //print message

    }
}
