import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        dos.writeInt(a);
        dos.writeInt(b);

        int result = dis.readInt();
        System.out.println("Modulus = " + result);

        dis.close();
        dos.close();
        s.close();
    }
}