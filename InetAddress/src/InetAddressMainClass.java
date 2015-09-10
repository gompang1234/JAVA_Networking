/**
 * Created by Mirim on 2015-09-08.
 */
import java.net.*;

public class InetAddressMainClass {
    public static void main(String[] args)  throws UnknownHostException {
        //내 컴퓨터
        System.out.println("내 컴퓨터");
        //get InetAddress from 127.0.0.1
        //IP 주소

        System.out.println("IP 주소 :" + InetAddress.getLocalHost().getHostAddress());
        //도메인 이름

        System.out.println("도메인 이름 :"+InetAddress.getLocalHost().getHostName());
        System.out.println("----------------------------------------------------------------------");

        //미림 홈페이지
        System.out.println("미림 홈페이지");
        //get InetAddress from www.e-mirim.hs.kr
        //IP 주소

        System.out.println("IP 주소 :"+InetAddress.getByName("www.e-mirim.hs.kr").getHostAddress());
        //도메인 이름

        System.out.println("도메인 이름 :"+InetAddress.getByName("www.e-mirim.hs.kr").getHostName());

    }
}
