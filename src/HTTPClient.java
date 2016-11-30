import java.net.*;
import java.io.*;

public class HTTPClient {
    public static void main(String[] args) throws IOException {
        Socket c = new Socket(InetAddress.getByName("127.0.0.1"), 8080);
        ClientProcessor m = new ClientProcessor(c);
        m.start();
    }
}