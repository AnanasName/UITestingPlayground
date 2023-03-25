package sample_app_test;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample_app_test.page.SampleAppPage;

import static util.Constants.BASE_URL;

public class SampleAppTest extends BaseTest {

    @BeforeMethod
    public void initMethod() {
        driver.get(BASE_URL + "sampleapp");
    }

    @Test
    public void testProgressBar() {
        SampleAppPage sampleAppPage = new SampleAppPage(driver);
        String login = "MyLogin";
        sampleAppPage.typeLogin(login);
        sampleAppPage.typePassword("pwd");
        sampleAppPage.clickLogOutButton();
        sampleAppPage.assertWelcomeTextContainsText(login);
    }
}
