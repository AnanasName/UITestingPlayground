package sample_app_tests.sample_app_selenium_test;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample_app_tests.sample_app_selenium_test.page.SampleAppPage;

import static org.testng.AssertJUnit.assertTrue;
import static util.Constants.BASE_URL;

public class SampleAppTest extends BaseTest {

    public static final String LOGIN = "LOGIN";
    public static final String PASSWORD = "pwd";

    @BeforeMethod
    @Override
    public void initMethod() {
        driver.get(BASE_URL + "sampleapp");
    }

    @Test
    public void testSampleApp() {
        SampleAppPage sampleAppPage = PageFactory.initElements(driver, SampleAppPage.class);
        sampleAppPage.typeLogin(LOGIN);
        sampleAppPage.typePassword(PASSWORD);
        sampleAppPage.clickLogOutButton();
        assertTrue(sampleAppPage.getWelcomeText().contains(LOGIN));
    }
}
