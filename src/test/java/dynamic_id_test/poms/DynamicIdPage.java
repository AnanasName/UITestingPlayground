package dynamic_id_test.poms;

import base.BasePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = http://uitestingplayground.com/dynamicid
public class DynamicIdPage extends BasePOM {

    @FindBy(className = "btn-primary")
    private WebElement button;

    public DynamicIdPage(WebDriver driver) {
        super(driver);
    }

    public void clickButton(){
        button.click();
    }
}