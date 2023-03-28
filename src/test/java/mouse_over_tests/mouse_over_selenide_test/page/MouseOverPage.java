package mouse_over_tests.mouse_over_selenide_test.page;


import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MouseOverPage {

    private final SelenideElement timesCount = $(byXpath("//*[@id=\"clickCount\"]"));

    private final SelenideElement clickmeButton = $(byLinkText("Click me"));

    public void clickOnRef() {
        clickmeButton.click();
    }

    public String getTimesCount() {
        return timesCount.getText();
    }
}
