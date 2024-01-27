package page;

import domain.RandomUserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KufarPage {
    public String inputButton = "//div[@data-testid='login_button']";
    public String inputTextEmail = "//input[@id='login']";
    public String inputTextPassword = "//input[@id='password']";
    public String inputButtonForm = "//div[@data-name='login_submit']//button[@type='submit']";
    public String inputText = "//div[@class='styles_with_sms_block__6_xkj']//div//p";
    public String textErrorEmail = "//div[@data-name='authorization_error_text']";
    WebDriver driver;

    public KufarPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickInputButton() {

        driver.findElement(By.xpath(inputButton)).click();
    }

    public void sendKeysInputTextEmail(String email) {

        driver.findElement(By.xpath(inputTextEmail)).sendKeys(email);
    }

    public void sendKeysInputRandomTextEmail() {

        driver.findElement(By.xpath(inputTextEmail)).sendKeys(RandomUserData.getRandomCorrectEmail());
    }

    public void sendKeysInputRandomTextPassword() {

        driver.findElement(By.xpath(inputTextPassword)).sendKeys(RandomUserData.getRandomPassword());
    }

    public void sendKeysInputTextPassword(String password) {

        driver.findElement(By.xpath(inputTextPassword)).sendKeys(password);
    }

    public void clickInputButtonForm() {

        driver.findElement(By.xpath(inputButtonForm)).click();
    }

    public String getTextError() {

        return driver.findElement(By.xpath(inputText)).getText();
    }

    public String getTextErrorEmail() {

        return driver.findElement(By.xpath(textErrorEmail)).getText();
    }

}
