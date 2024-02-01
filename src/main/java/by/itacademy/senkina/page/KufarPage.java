package by.itacademy.senkina.page;

import by.itacademy.senkina.domain.RandomUserData;
import by.itacademy.senkina.driver.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class KufarPage {
    public String inputButton = "//div[@data-testid='login_button']";
    public String inputTextEmail = "//input[@id='login']";
    public String inputTextPassword = "//input[@id='password']";
    public String inputButtonForm = "//div[@data-name='login_submit']//button[@type='submit']";
    public String inputText = "//div[@class='styles_with_sms_block__6_xkj']//div//p";
    public String textErrorEmail = "//div[@data-name='authorization_error_text']";
    public String fieldForSearch = "//input[@class='styles_input__IvCG7']";
    public String buttonSearch = "//button[@class='styles_search_button__Ro1wM']";
    public String titleSearch = "//h1[@class='styles_title__OnM2K']";
    public String inputButtonChooseRegion = "//div[@class='styles_region__qknLB']";
    public String dropDownRegion = "//select[@data-testid=\"kufar-region-switcher-popup-region\"]";
    public String dropDownGomelRegion = " //option[@value='2']";
    public String inputButtonChoseFinalRegion = " //button[@data-testid='kufar-region-switcher-popup-submit-button']";
    public String linkMobilePhones = "//a[@id=\"17000\"]";
    public String chooseCategoryMobilePhones = "//span[@class='styles_link__text__yW1k7 styles_link__text--menu-tree__jVaR7']";
    public String chooseCreater = "//div[@class='styles_inputContainer__NLXKe']//div[@class='styles_iconsContainer__hgUaO']//option[@value='5']";
    public String inputButtonFind = "//button[@data-name='filter-submit-button']";
    private static final Logger logger = LogManager.getLogger();
    WebDriver driver;

    public KufarPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickInputButton() {

        driver.findElement(By.xpath(inputButton)).click();
        Waiter.waitFor(1);
        logger.info("Click on input button");
    }

    public void sendKeysInputTextEmail(String email) {

        driver.findElement(By.xpath(inputTextEmail)).sendKeys(email);
        logger.info("Click on input button");
    }

    public void sendKeysInputRandomTextEmail() {

        driver.findElement(By.xpath(inputTextEmail)).sendKeys(RandomUserData.getRandomCorrectEmail());
        logger.info("Send keys input random email");
    }

    public void sendKeysInputRandomTextPassword() {

        driver.findElement(By.xpath(inputTextPassword)).sendKeys(RandomUserData.getRandomPassword());
        logger.info("Send keys input random password");
    }

    public void sendKeysInputTextPassword(String password) {

        driver.findElement(By.xpath(inputTextPassword)).sendKeys(password);
        logger.info("Send keys input password");
    }

    public void clickInputButtonForm() {

        driver.findElement(By.xpath(inputButtonForm)).click();
        Waiter.waitFor(1);
        logger.info("Click on input button form");
    }

    public String getTextError() {

        String actualResult =  driver.findElement(By.xpath(inputText)).getText();
        logger.info("Actual text error: " + actualResult);
        return actualResult;
    }

    public String getTextErrorEmail() {

        String actualResult =  driver.findElement(By.xpath(textErrorEmail)).getText();
        logger.info("Actual text error email: " + actualResult);
        return actualResult;
    }

    public void sendTextForSearch(String name) {

        driver.findElement(By.xpath(fieldForSearch)).sendKeys(name);
        Waiter.waitFor(1);
        logger.info("Send text for search");
    }

    public void clickInputButtonSearch() {

        driver.findElement(By.xpath(buttonSearch)).click();
        Waiter.waitFor(1);
        logger.info("Click on input button search");
    }

    public String getTextTitleSearch() {

        String actualResult =  driver.findElement(By.xpath(titleSearch)).getText();
        logger.info("Actual text title search: " + actualResult);
        return actualResult;
    }

    public void clickInputButtonChooseRegion() {

        driver.findElement(By.xpath(inputButtonChooseRegion)).click();
        logger.info("Click on input button choose region");
    }

    public void clickDropDownRegion() {

        driver.findElement(By.xpath(dropDownRegion)).click();
        logger.info("Click drop down region");
    }

    public void clickDropDownGomelRegion() {

        driver.findElement(By.xpath(dropDownGomelRegion)).click();
        logger.info("Click drop down gomel region");
    }

    public void clickInputButtonChoseFinalRegion() {

        driver.findElement(By.xpath(inputButtonChoseFinalRegion)).click();
        logger.info("Click on Input button choose final region");
    }

    public void clickChooseLinkMobilePhones() {

        driver.findElement(By.xpath(linkMobilePhones)).click();
        Waiter.waitFor(1);
        logger.info("Click on link mobile phones");
    }

    public void clickChooseCategoryMobilePhones() {

        driver.findElement(By.xpath(chooseCategoryMobilePhones)).click();
        logger.info("Choose category mobile phones");
    }

    public void clickChooseCreater() {

        driver.findElement(By.xpath(chooseCreater)).click();
        Waiter.waitFor(1);
        logger.info("Click on input button choose creater");
    }

    public void clickInputButtonFind() {

        driver.findElement(By.xpath(inputButtonFind)).click();
        Waiter.waitFor(1);
        logger.info("Click on input button find");
    }

}