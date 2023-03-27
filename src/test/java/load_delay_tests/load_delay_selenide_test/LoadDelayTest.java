package load_delay_tests.load_delay_selenide_test;

import com.codeborne.selenide.WebDriverRunner;
import load_delay_tests.load_delay_selenide_test.page.MainPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static util.Constants.BASE_URL;

public class LoadDelayTest {

    @BeforeMethod
    public void initMethod() {
        open(BASE_URL);
    }

    @Test
    public void testLoadDelay() {
        MainPage mainPage = new MainPage();
        mainPage.clickLoadDelayRefAndWaitForNewPage(WebDriverRunner.getWebDriver());
    }
}


