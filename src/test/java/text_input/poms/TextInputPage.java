package text_input.poms;

import base.BasePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TextInputPage extends BasePOM {
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

    public void assertButton(String text) {
        assertThat(updateButton.getText().equals(text));
    }
}
