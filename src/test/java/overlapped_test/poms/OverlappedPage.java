package overlapped_test.poms;

import base.BasePOM;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class OverlappedPage extends BasePOM {

    @FindBy(xpath = "//input[@id='id']")
    private WebElement idInput;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement nameInput;

    public OverlappedPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToNameInput() {
        new Actions(driver)
                .scrollFromOrigin(WheelInput.ScrollOrigin.fromElement(idInput), 0, 200)
                .perform();
    }

    public void typeTextInNameInput(String text){
        nameInput.sendKeys(text);
    }

    public void assertTextInNameInputCorrect(String text){
        assertThat(nameInput.getText().equals(text));
    }

    public void assertThatNameInputIsVisible(){
        assertThat(nameInput.isDisplayed());
    }
}