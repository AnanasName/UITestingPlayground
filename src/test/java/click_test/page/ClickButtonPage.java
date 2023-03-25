package click_test.page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

// page_url = http://uitestingplayground.com/click
public class ClickButtonPage extends BasePage {

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