import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server waiting...");

        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        int a = dis.readInt();
        int b = dis.readInt();

        int mod = a % b;
        dos.writeInt(mod);

        dis.close();
        dos.close();
        s.close();
        ss.close();
    }
}