package class_attr_tests.class_attr_selenide_test.page;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ClassAttrPage {
    private final SelenideElement primaryButton = $(byXpath("//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]"));

    public void clickPrimaryButton() {
        primaryButton.click();
    }

    public String getTextFromAlert() {
        return Selenide.switchTo().alert().getText();
    }

    public void clickOkInAlert() {
        Selenide.switchTo().alert().accept();
    }
}
