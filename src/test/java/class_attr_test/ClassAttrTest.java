package class_attr_test;

import base.BaseTest;
import class_attr_test.page.ClassAttrPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.testng.AssertJUnit.assertEquals;
import static util.Constants.BASE_URL;

public class ClassAttrTest extends BaseTest {

    public static final String alertText = "Primary button pressed";

    @BeforeMethod
    public void initMethod() {
        driver.get(BASE_URL + "classattr");
    }

    @Test
    public void clickPrimaryButtonTest() {
        ClassAttrPage classAttrPage = new ClassAttrPage(driver);
        classAttrPage.clickPrimaryButton();
        assertEquals(alertText, classAttrPage.getTextFromAlert());
        classAttrPage.clickOkInAlert();
    }
}