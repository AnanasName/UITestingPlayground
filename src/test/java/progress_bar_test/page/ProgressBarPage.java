package progress_bar_test.page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ProgressBarPage extends BasePage {

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
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(50));

        wait.until(ExpectedConditions.textToBePresentInElement(progressBar, valueInProgressBar));
    }
}
