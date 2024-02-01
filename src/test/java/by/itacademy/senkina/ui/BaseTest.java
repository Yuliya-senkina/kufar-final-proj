package by.itacademy.senkina.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    WebDriver driver;
    private static final Logger logger = LogManager.getLogger();
    BaseTest baseTest;


    @BeforeEach
    public void start() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.kufar.by/");
        logger.info("Home page www.kufar.by is opened");
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }
}
