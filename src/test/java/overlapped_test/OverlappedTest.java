package overlapped_test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import load_delay.poms.MainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import overlapped_test.poms.OverlappedPage;

import static util.Constants.BASE_URL;

public class OverlappedTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "overlapped");
    }

    @Test
    public void testLoadDelay(){
        String textToTest = "My Name";
        OverlappedPage overlappedPage = new OverlappedPage(driver);
        overlappedPage.scrollToNameInput();
        overlappedPage.typeTextInNameInput(textToTest);
        overlappedPage.assertTextInNameInputCorrect(textToTest);
        overlappedPage.assertThatNameInputIsVisible();
    }
}
