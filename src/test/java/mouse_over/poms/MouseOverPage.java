package mouse_over.poms;

import base.BasePOM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class MouseOverPage extends BasePOM {

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

    public void assertClickTimes(){
        assertThat(timesCount.getText().equals("1"));
    }
}
