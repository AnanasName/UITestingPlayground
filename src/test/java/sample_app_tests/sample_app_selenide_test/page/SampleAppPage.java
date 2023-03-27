package sample_app_tests.sample_app_selenide_test.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class SampleAppPage {
    private final SelenideElement welcomeText = $(byXpath("//label[@id='loginstatus']"));
    private final SelenideElement loginInput = $(byXpath("//input[@name='UserName']"));
    private final SelenideElement passwordInput = $(byXpath("//input[@name='Password']"));
    private final SelenideElement logOutButton = $(byXpath("//button[@id='login']"));

    public void typeLogin(String login){
        loginInput.val(login);
    }

    public void typePassword(String password){
        passwordInput.val(password);
    }

    public void clickLogOutButton(){
        logOutButton.click();
    }

    public String getWelcomeText(){
        return welcomeText.text();
    }
}
