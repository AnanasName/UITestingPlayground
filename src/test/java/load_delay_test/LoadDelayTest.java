package load_delay_test;

import base.BaseTest;
import load_delay_test.page.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class LoadDelayTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        driver.get(BASE_URL);
    }

    @Test
    public void testLoadDelay() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLoadDelayRefAndWaitForNewPage();
    }
}


