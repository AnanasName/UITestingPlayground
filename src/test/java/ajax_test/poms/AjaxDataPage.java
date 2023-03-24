package ajax_test.poms;

import base.BasePOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class AjaxDataPage extends BasePOM {

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
                .pollingEvery(Duration.ofSeconds(   1))
                .withTimeout(Duration.ofSeconds(60));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
    }
}
