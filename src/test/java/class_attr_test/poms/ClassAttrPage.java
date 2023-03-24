package class_attr_test.poms;

import base.BasePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ClassAttrPage extends BasePOM {

    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    private WebElement primaryButton;

    public ClassAttrPage(WebDriver driver) {
        super(driver);
    }

    public void clickPrimaryButton(){
        primaryButton.click();
    }

    public void assertTextInAlert(String textInAlert){
        assertThat(driver.switchTo().alert().getText());
    }

    public void clickOkInAlert(){
        driver.switchTo().alert().accept();
    }
}
