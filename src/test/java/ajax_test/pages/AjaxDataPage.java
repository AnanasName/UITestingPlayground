package ajax_test.pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class AjaxDataPage extends BasePage {

    public static final int POLLING_TIME = 1;
    public static final int TIMEOUT_TIME = 60;

    @FindBy(xpath = "//button[@id='ajaxButton']")
    private WebElement triggerButton;

    public AjaxDataPage(WebDriver driver) {
        super(driver);
    }

    public void clickTriggerButton(){
        triggerButton.click();
    }

    public void waitForAjaxText(){
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .pollingEvery(Duration.ofSeconds(POLLING_TIME))
                .withTimeout(Duration.ofSeconds(TIMEOUT_TIME));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
    }
}
