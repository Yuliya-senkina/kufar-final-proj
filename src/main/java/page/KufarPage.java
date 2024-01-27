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

    public void sendTextForSearch(String name) {

        driver.findElement(By.xpath(fieldForSearch)).sendKeys(name);

    }

    public void clickInputButtonSearch() {

        driver.findElement(By.xpath(buttonSearch)).click();
    }

    public String getTextTitleSeach() {

        return driver.findElement(By.xpath(titleSearch)).getText();
    }

    public void clickInputButtonChooseRegion() {

        driver.findElement(By.xpath(inputButtonChooseRegion)).click();
    }

    public void clickDropDownRegion() {

        driver.findElement(By.xpath(dropDownRegion)).click();
    }

    public void clickDropDownGomelRegion() {

        driver.findElement(By.xpath(dropDownGomelRegion)).click();
    }

    public void clickInputButtonChoseFinalRegion() {

        driver.findElement(By.xpath(inputButtonChoseFinalRegion)).click();
    }

    public void clickChooseLinkMobilePhones() {

        driver.findElement(By.xpath(linkMobilePhones)).click();
    }

    public void clickChooseCategoryMobilePhones() {

        driver.findElement(By.xpath(chooseCategoryMobilePhones)).click();
    }

    public void clickChooseCreater() {

        driver.findElement(By.xpath(chooseCreater)).click();
    }

    public void clickInputButtonFind() {

        driver.findElement(By.xpath(inputButtonFind)).click();
    }

}