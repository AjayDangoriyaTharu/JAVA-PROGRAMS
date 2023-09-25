import java.io.*;
import java.net.*;
public class inetexample {
    public static void main(String[] args) {
        try{
            InetAddress ip = InetAddress.getByName("www.facebook.com");
            System.out.println("\nIP Address: " +ip.getHostName());
            System.out.println("\nIP Address: " +ip.getHostAddress());
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
