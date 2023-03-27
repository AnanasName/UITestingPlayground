package load_delay_test.page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class MainPage extends BasePage {

    public static final int TIMEOUT_DURATION = 15;
    public static final int POLLING_DURATION = 3;

    @FindBy(xpath = "//*[@href='/loaddelay']")
    private WebElement loadDelayRef;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoadDelayRefAndWaitForNewPage() {
        loadDelayRef.click();
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(TIMEOUT_DURATION))
                .pollingEvery(Duration.ofSeconds(POLLING_DURATION))
                .ignoring(NoSuchElementException.class);

        wait.until(driver -> driver.findElement(By.className("btn-primary")));
    }
}
