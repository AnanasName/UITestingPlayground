package sample_app_tests.sample_app_selenide_test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sample_app_tests.sample_app_selenide_test.page.SampleAppPage;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertTrue;
import static util.Constants.BASE_URL;

public class SampleAppTest {
    public static final String LOGIN = "LOGIN";
    public static final String PASSWORD = "pwd";

    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "sampleapp");
    }

    @Test
    public void testSampleApp() {
        SampleAppPage sampleAppPage = new SampleAppPage();
        sampleAppPage.typeLogin(LOGIN);
        sampleAppPage.typePassword(PASSWORD);
        sampleAppPage.clickLogOutButton();
        assertTrue(sampleAppPage.getWelcomeText().contains(LOGIN));
    }
}
