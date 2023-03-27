package dynamic_id_tests.dynamic_id_selenide_test.page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

// page_url = http://uitestingplayground.com/dynamicid
public class DynamicIdPage {

    private WebElement button = $(byClassName("btn-primary"));

    public void clickButton(){
        button.click();
    }
}