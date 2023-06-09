package text_input_tests.text_input_selenium_test.page;

import base.base_selenium.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextInputPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"updatingButton\"]")
    private WebElement updateButton;

    @FindBy(xpath = "//*[@id=\"newButtonName\"]")
    private WebElement inputText;

    public TextInputPage(WebDriver driver) {
        super(driver);
    }

    public void inputText(String text) {
        inputText.sendKeys(text);
    }

    public void clickUpdateButton() {
        updateButton.click();
    }

    public String getUpdateButtonText(){
        return updateButton.getText();
    }
}
