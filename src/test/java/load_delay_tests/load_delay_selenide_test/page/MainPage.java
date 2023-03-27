package load_delay_tests.load_delay_selenide_test.page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {

    public static final int TIMEOUT_DURATION = 15000;
    public static final int POLLING_DURATION = 1000;

    private final SelenideElement loadDelayRef = $(byXpath("//*[@href='/loaddelay']"));

    public void clickLoadDelayRefAndWaitForNewPage(WebDriver driver) {
        loadDelayRef.click();
        SelenideWait selenideWait = new SelenideWait(driver, TIMEOUT_DURATION, POLLING_DURATION);

        selenideWait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-primary")));
    }
}
