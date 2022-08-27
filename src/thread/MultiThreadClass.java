package thread;

public class MultiThreadClass extends Thread{

    public void run() {
        int size = 10000;
        for (int i=0; i<size; i++) {
            System.out.println(i);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
