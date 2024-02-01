package by.itacademy.senkina.driver;

public class Waiter {

    public static void waitFor(int seconds) {
        try {
           Thread.sleep(seconds * 1000L);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
}
    }
}
