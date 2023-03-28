package progress_bar_tests.progress_bar_selenide_test.page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ProgressBarPage {
    private static final int TIMEOUT_DURATION = 60000;
    public static final int POLLING_DURATION = 70;

    private final SelenideElement startButton = $(byXpath("//button[@id='startButton']"));
    private final SelenideElement stopButton = $(byXpath("//button[@id='stopButton']"));
    private final SelenideElement progressBar = $(byXpath("//div[@id='progressBar']"));

    public void clickStartButton() {
        startButton.click();
    }

    public void clickStopButton() {
        stopButton.click();
    }

    public void waitForProgressBarValue(WebDriver driver, String valueInProgressBar) {
        SelenideWait selenideWait = new SelenideWait(driver, TIMEOUT_DURATION, POLLING_DURATION);

        selenideWait.until(ExpectedConditions.textToBePresentInElement(progressBar, valueInProgressBar));
    }
}
