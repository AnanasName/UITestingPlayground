package ajax_tests.ajax_selenide_test.pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.SelenideWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class AjaxDataPage {
    public static final int POLLING_TIME = 1000;
    public static final int TIMEOUT_TIME = 20000;

    private final SelenideElement triggerButton = $(byXpath("//button[@id='ajaxButton']"));

    public void clickTriggerButton() {
        triggerButton.click();
    }

    public void waitForAjaxText(WebDriver driver) {
        SelenideWait selenideWait = new SelenideWait(driver, TIMEOUT_TIME, POLLING_TIME);

        selenideWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='bg-success']")));
    }
}
