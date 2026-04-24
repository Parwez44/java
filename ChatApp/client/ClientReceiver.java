package client;

import java.io.BufferedReader;

public class ClientReceiver extends Thread {
    private BufferedReader in;

    public ClientReceiver(BufferedReader in) {
        this.in = in;
    }

    public void run() {
        try {
            String msg;
            while ((msg = in.readLine()) != null) {
                System.out.println(msg);
            }
        } catch (Exception e) {
        }
    }
}