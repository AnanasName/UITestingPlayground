package load_delay_tests.load_delay_selenium_test;

import base.base_selenium.BaseTest;
import load_delay_tests.load_delay_selenium_test.page.MainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoadDelayTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("");
    }

    @Test
    public void testLoadDelay() {
        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
        mainPage.clickLoadDelayRefAndWaitForNewPage();
    }
}


