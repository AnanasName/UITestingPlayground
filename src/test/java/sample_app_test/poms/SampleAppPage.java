package sample_app_test.poms;

import base.BasePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SampleAppPage extends BasePOM {

    @FindBy(xpath = "//label[@id='loginstatus']")
    private WebElement welcomeText;
    @FindBy(xpath = "//input[@name='UserName']")
    private WebElement loginInput;
    @FindBy(xpath = "//input[@name='Password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@id='login']")
    private WebElement logOutButton;

    public SampleAppPage(WebDriver driver) {
        super(driver);
    }

    public void typeLogin(String login){
        loginInput.sendKeys(login);
    }

    public void typePassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickLogOutButton(){
        logOutButton.click();
    }

    public void assertWelcomeTextContainsText(String textToAssert){
        assertThat(welcomeText.getText().contains(textToAssert));
    }
}
