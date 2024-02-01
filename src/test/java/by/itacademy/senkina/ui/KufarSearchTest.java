package by.itacademy.senkina.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.itacademy.senkina.page.KufarPage;

public class KufarSearchTest extends BaseTest  {
    private static final Logger logger = LogManager.getLogger();
    @Test
    public void testSearchProduct() throws InterruptedException {
        logger.info("Started " + Thread.currentThread().getStackTrace()[1].getMethodName());
        KufarPage kufar = new KufarPage(driver);
        kufar.sendTextForSearch("Iphone 15 pro Max");
        kufar.clickInputButtonSearch();
        Assertions.assertEquals("«Iphone 15 pro Max» в Беларуси", kufar.getTextTitleSearch());
        logger.info("Test passed \n");
    }

    @Test
    public void testFilterSearchIphoneGomel() throws InterruptedException {
        logger.info("Started " + Thread.currentThread().getStackTrace()[1].getMethodName());
        KufarPage kufar = new KufarPage(driver);
        kufar.clickInputButtonChooseRegion();
        kufar.clickDropDownRegion();
        kufar.clickDropDownGomelRegion();
        kufar.clickInputButtonChoseFinalRegion();
        kufar.clickChooseLinkMobilePhones();
        kufar.clickChooseCategoryMobilePhones();
        kufar.clickChooseCreater();
        kufar.clickInputButtonFind();
        Assertions.assertEquals("Мобильные телефоны Apple iPhone в Гомельской области", kufar.getTextTitleSearch());
        logger.info("Test passed \n");
    }
}
