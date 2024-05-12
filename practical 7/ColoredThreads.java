public class ColoredThreads extends Thread {
    public static void main(String[] args) {
        Thread redThread = new Thread(() -> System.out.println("Red Thread is running"), "Red");
        Thread blueThread = new Thread(() -> System.out.println("Blue Thread is running"), "Blue");
        Thread greenThread = new Thread(() -> System.out.println("Green Thread is running"), "Green");

        redThread.start();
        blueThread.start();
        greenThread.start();

        System.out.println("Main thread finished execution");
    }
}
public class B implements Runnable {
    public void run() {
        System.out.println("B is running");
    }
}
