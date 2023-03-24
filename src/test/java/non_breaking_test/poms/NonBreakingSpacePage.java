package non_breaking_test.poms;

import base.BasePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NonBreakingSpacePage extends BasePOM {

    @FindBy(xpath = "//button[contains(., 'My') and contains(., 'Button')]")
    private WebElement button;

    public NonBreakingSpacePage(WebDriver driver) {
        super(driver);
    }

    public void clickButton(){
        button.click();
    }
}
