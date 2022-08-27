package thread;

public class MultiThread {
    public static void main(String[] args) {
        MultiThreadClass multi1 = new MultiThreadClass();
        MultiThreadClass multi2 = new MultiThreadClass();
        MultiThreadClass multi3 = new MultiThreadClass();
        MultiThreadClass multi4 = new MultiThreadClass();
        multi1.start();
        multi2.start();
        multi3.start();
        multi4.start();
    }
}
