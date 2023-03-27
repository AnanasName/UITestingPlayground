package text_input_test.page;

import base.BasePage;
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
