package mouse_over_test.page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseOverPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"clickCount\"]")
    private WebElement timesCount;

    @FindBy(linkText = "Click me")
    private WebElement clickmeButton;

    public MouseOverPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnRef() {
        clickmeButton.click();
    }

    public String getTimesCount() {
        return timesCount.getText();
    }
}
