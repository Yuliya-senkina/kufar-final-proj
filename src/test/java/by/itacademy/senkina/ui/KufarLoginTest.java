package by.itacademy.senkina.ui;

import by.itacademy.senkina.driver.Waiter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.itacademy.senkina.page.KufarPage;

public class KufarLoginTest extends BaseTest {

    private static final Logger logger = LogManager.getLogger();

    @Test
    public void testLoginRandomEmailPassword() throws InterruptedException {
        logger.info("Started " + Thread.currentThread().getStackTrace()[1].getMethodName());
        KufarPage kufar = new KufarPage(driver);
        kufar.clickInputButton();
        kufar.sendKeysInputRandomTextEmail();
        kufar.sendKeysInputRandomTextPassword();
        kufar.clickInputButtonForm();
        Assertions.assertEquals("Введен неверный пароль либо такого профиля не существует", kufar.getTextError());
        logger.info("Test passed \n");
    }

    @Test
    public void testLoginEmptyEmailPassword() throws InterruptedException {
        logger.info("Started " + Thread.currentThread().getStackTrace()[1].getMethodName());
        KufarPage kufar = new KufarPage(driver);
        kufar.clickInputButton();
        kufar.sendKeysInputTextEmail("");
        kufar.sendKeysInputTextPassword("");
        kufar.clickInputButtonForm();
        Assertions.assertEquals("Заполните обязательное поле", kufar.getTextErrorEmail());
        logger.info("Test passed \n");
    }
}
