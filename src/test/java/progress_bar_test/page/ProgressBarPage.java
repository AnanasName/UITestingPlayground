package progress_bar_test.page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

//TODO исправить логику
public class ProgressBarPage extends BasePage {

    private static final int TIMEOUT_DURATION = 15;
    public static final int POLLING_DURATION = 70;

    @FindBy(xpath = "//button[@id='startButton']")
    private WebElement startButton;

    @FindBy(xpath = "//button[@id='stopButton']")
    private WebElement stopButton;

    @FindBy(xpath = "//div[@id='progressBar']")
    private WebElement progressBar;

    public ProgressBarPage(WebDriver driver) {
        super(driver);
    }

    public void clickStartButton() {
        startButton.click();
    }

    public void clickStopButton() {
        stopButton.click();
    }

    public void waitForProgressBarValue(String valueInProgressBar) {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofMillis(POLLING_DURATION))
                .withTimeout(Duration.ofSeconds(TIMEOUT_DURATION));

        wait.until(ExpectedConditions.textToBePresentInElement(progressBar, valueInProgressBar));
    }
}
