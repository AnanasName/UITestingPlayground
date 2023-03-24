package click_test.poms;

import base.BasePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// page_url = http://uitestingplayground.com/click
public class ClickButtonPage extends BasePOM {

    @FindBy(xpath = "//*[@id=\"badButton\"]")
    private WebElement button;

    public ClickButtonPage(WebDriver driver) {
        super(driver);
    }

    public void clickButton(){
        button.click();
    }

    public void clickButtonPhysical(){
        new Actions(driver)
                .click(button)
                .perform();
    }
}