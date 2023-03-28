package client_side_delay_tests.client_side_delay_selenide_test.page;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ClientSideDelayPage{

    public static final int POLLING_TIME = 100;
    public static final int TIMEOUT_TIME = 20000;

    private final SelenideElement testTargetButton = $(byId("ajaxButton"));

    private WebElement successMessage;

    public void clickTestTargetButton() {
        testTargetButton.click();
    }

    public void waitForMessage(WebDriver driver) {
        SelenideWait selenideWait = new SelenideWait(driver, TIMEOUT_TIME, POLLING_TIME);

        successMessage = selenideWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
    }

    public String getSuccessMessageText() {
        if (successMessage != null)
            return successMessage.getText();
        else
            return "null";
    }
}
