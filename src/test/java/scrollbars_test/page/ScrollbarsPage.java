package scrollbars_test.page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ScrollbarsPage extends BasePage {

    @FindBy(id = "hidingButton")
    private WebElement targetButton;

    public ScrollbarsPage(WebDriver driver) {
        super(driver);
    }

    public void moveToTargetButton() {
        new Actions(driver)
                .moveToElement(targetButton)
                .perform();
    }

    public void clickTargetButton() {
        targetButton.click();
    }
}
