package class_attr_test;

import base.base_selenium.BaseTest;
import class_attr_test.page.ClassAttrPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ClassAttrTest extends BaseTest {

    public static final String alertText = "Primary button pressed";

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("classattr");
    }

    @Test
    public void clickPrimaryButtonTest() {
        ClassAttrPage classAttrPage = PageFactory.initElements(driver, ClassAttrPage.class);
        classAttrPage.clickPrimaryButton();
        assertEquals(alertText, classAttrPage.getTextFromAlert());
        classAttrPage.clickOkInAlert();
    }
}