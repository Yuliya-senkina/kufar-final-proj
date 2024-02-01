package by.itacademy.senkina.driver;

import org.openqa.selenium.WebDriver;
import java.time.Duration;

public class Waiter {

    public static void waitFor(int seconds) {
        try {
           Thread.sleep(seconds * 1000L);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
}
    }
    public static void waiter(WebDriver driver){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
