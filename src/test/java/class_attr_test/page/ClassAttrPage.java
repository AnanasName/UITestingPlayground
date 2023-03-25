package class_attr_test.page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ClassAttrPage extends BasePage {

    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    private WebElement primaryButton;

    public ClassAttrPage(WebDriver driver) {
        super(driver);
    }

    public void clickPrimaryButton() {
        primaryButton.click();
    }

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    public void clickOkInAlert() {
        driver.switchTo().alert().accept();
    }
}
