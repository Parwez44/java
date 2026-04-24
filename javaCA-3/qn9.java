class CountdownThread extends Thread {
    public void run() {
        for (int i = 7; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class qn9 {
    public static void main(String[] args) {
        CountdownThread t = new CountdownThread();
        t.start();
    }
}