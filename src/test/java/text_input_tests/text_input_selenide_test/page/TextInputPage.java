package text_input_tests.text_input_selenide_test.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class TextInputPage {
    private final SelenideElement updateButton = $(byXpath("//*[@id=\"updatingButton\"]"));
    private final SelenideElement inputText = $(byXpath("//*[@id=\"newButtonName\"]"));

    public void inputText(String text) {
        inputText.val(text);
    }

    public void clickUpdateButton() {
        updateButton.click();
    }

    public String getUpdateButtonText() {
        return updateButton.getText();
    }
}
