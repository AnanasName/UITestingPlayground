package client_side_delay_tests.client_side_delay_selenium_test.page;

import base.base_selenium.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ClientSideDelayPage extends BasePage {

    public static final int POLLING_TIME = 1;
    public static final int TIMEOUT_TIME = 15;

    @FindBy(id = "ajaxButton")
    private WebElement testTargetButton;

    private WebElement successMessage;

    public ClientSideDelayPage(WebDriver driver) {
        super(driver);
    }

    public void clickTestTargetButton() {
        testTargetButton.click();
    }

    public void waitForMessage() {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(POLLING_TIME))
                .withTimeout(Duration.ofSeconds(TIMEOUT_TIME));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));

        successMessage = driver.findElement(By.xpath("//p[@class='bg-success']"));
    }

    public String getSuccessMessageText() {
        if (successMessage != null)
            return successMessage.getText();
        else
            return "null";
    }
}
