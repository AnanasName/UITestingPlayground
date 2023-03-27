package dynamic_id_tests.dynamic_id_selenide_test.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.$;

// page_url = http://uitestingplayground.com/dynamicid
public class DynamicIdPage {

    private final SelenideElement button = $(byClassName("btn-primary"));

    public void clickButton(){
        button.click();
    }
}