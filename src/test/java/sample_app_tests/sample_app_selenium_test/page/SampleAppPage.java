package sample_app_tests.sample_app_selenium_test.page;

import base.base_selenium.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SampleAppPage extends BasePage {

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

    public void typeLogin(String login) {
        loginInput.sendKeys(login);
    }

    public void typePassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLogOutButton() {
        logOutButton.click();
    }

    public String getWelcomeText() {
        return welcomeText.getText();
    }
}
