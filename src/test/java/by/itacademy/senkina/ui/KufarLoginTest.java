package by.itacademy.senkina.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.KufarPage;

public class KufarLoginTest extends BaseTest {

    @Test
    public void testLoginRandomEmailPassword() throws InterruptedException {
        driver.get("https://www.kufar.by/");
        KufarPage kufar = new KufarPage(driver);
        kufar.clickInputButton();
        Thread.sleep(1000);
        kufar.sendKeysInputRandomTextEmail();
        kufar.sendKeysInputRandomTextPassword();
        kufar.clickInputButtonForm();
        Thread.sleep(5000);
        Assertions.assertEquals("Введен неверный пароль либо такого профиля не существует", kufar.getTextError());
    }

    @Test
    public void testLoginEmptyEmailPassword() throws InterruptedException {
        driver.get("https://www.kufar.by/");
        KufarPage kufar = new KufarPage(driver);
        kufar.clickInputButton();
        Thread.sleep(1000);
        kufar.sendKeysInputTextEmail("");
        kufar.sendKeysInputTextPassword("");
        kufar.clickInputButtonForm();
        Thread.sleep(5000);
        Assertions.assertEquals("Заполните обязательное поле", kufar.getTextErrorEmail());
        Assertions.assertEquals("Введите пароль", kufar.getTextErrorPassword());
    }

    @Test
    public void testLoginEmptyEmailPassword2() throws InterruptedException {
        driver.get("https://www.kufar.by/");
        KufarPage kufar = new KufarPage(driver);
        kufar.clickInputButton();
        Thread.sleep(1000);
        kufar.sendKeysInputTextEmail("");
        kufar.sendKeysInputTextPassword("");
        kufar.clickInputButtonForm();
        Thread.sleep(5000);
        Assertions.assertEquals("Заполните обязательное поле", kufar.getTextErrorEmail());
    }
}
