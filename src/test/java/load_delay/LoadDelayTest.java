package load_delay;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import load_delay.poms.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class LoadDelayTest extends BaseTest {

    @BeforeMethod
    public void initMethod() {
        driver.get(BASE_URL);
    }

    @Test
    public void testLoadDelay() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickLoadDelayRefAndWaitForNewPage();
    }
}


