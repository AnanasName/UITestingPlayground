package click_button_tests.click_button_selenide_test.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ClickButtonPage {
    private final SelenideElement targetButton = $(byXpath("//*[@id='badButton']"));

    public void clickButton() {
        targetButton.click();
    }
}
