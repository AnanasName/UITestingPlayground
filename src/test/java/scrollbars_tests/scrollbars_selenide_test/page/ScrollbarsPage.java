package scrollbars_tests.scrollbars_selenide_test.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ScrollbarsPage {

    private final SelenideElement targetButton = $(byId("hidingButton"));

    public void moveToTargetButton() {
        targetButton.scrollTo();
    }

    public void clickTargetButton() {
        targetButton.click();
    }
}
