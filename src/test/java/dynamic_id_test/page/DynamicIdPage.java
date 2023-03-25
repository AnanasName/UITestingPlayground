package dynamic_id_test.page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

// page_url = http://uitestingplayground.com/dynamicid
public class DynamicIdPage extends BasePage {

    @FindBy(className = "btn-primary")
    private WebElement button;

    public DynamicIdPage(WebDriver driver) {
        super(driver);
    }

    public void clickButton(){
        button.click();
    }
}