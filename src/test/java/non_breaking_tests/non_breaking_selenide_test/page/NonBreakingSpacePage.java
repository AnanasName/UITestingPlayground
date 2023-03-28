package non_breaking_tests.non_breaking_selenide_test.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class NonBreakingSpacePage {

    private final SelenideElement button = $(byXpath("//button[contains(., 'My') and contains(., 'Button')]"));

    public void clickButton(){
        button.click();
    }
}
