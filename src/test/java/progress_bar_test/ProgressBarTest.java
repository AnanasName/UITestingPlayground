package progress_bar_test;

import base.BaseTest;
import class_attr_test.poms.ClassAttrPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import progress_bar_test.poms.ProgressBarPage;

import java.time.Duration;
import java.util.function.Function;

import static util.Constants.BASE_URL;

public class ProgressBarTest extends BaseTest {
    @BeforeMethod
    public void initMethod() {
        driver.get(BASE_URL + "progressbar");
    }

    @Test
    public void testProgressBar() {
        ProgressBarPage progressBarPage = new ProgressBarPage(driver);
        progressBarPage.clickStartButton();
        progressBarPage.waitForProgressBarValue("75%");
        progressBarPage.clickStopButton();
    }
}
