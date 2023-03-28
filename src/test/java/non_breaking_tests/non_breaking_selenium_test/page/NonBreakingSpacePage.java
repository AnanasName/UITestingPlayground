package non_breaking_tests.non_breaking_selenium_test.page;

import base.base_selenium.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NonBreakingSpacePage extends BasePage {

    @FindBy(xpath = "//button[contains(., 'My') and contains(., 'Button')]")
    private WebElement button;

    public NonBreakingSpacePage(WebDriver driver) {
        super(driver);
    }

    public void clickButton(){
        button.click();
    }
}
