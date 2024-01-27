package by.itacademy.senkina.ui;

import driver.Waiter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.KufarPage;

public class KufarSearchTest extends BaseTest  {

    @Test
    public void testSearchProduct() throws InterruptedException {
        KufarPage kufar = new KufarPage(driver);
        kufar.sendTextForSearch("Iphone 15 pro Max");
        Waiter.waitFor(1);
        kufar.clickInputButtonSearch();
        Waiter.waitFor(1);
        Assertions.assertEquals("«Iphone 15 pro Max» в Беларуси", kufar.getTextTitleSeach());
    }
}
