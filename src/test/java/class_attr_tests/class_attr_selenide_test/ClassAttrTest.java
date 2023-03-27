package class_attr_tests.class_attr_selenide_test;

import class_attr_tests.class_attr_selenide_test.page.ClassAttrPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertEquals;
import static util.Constants.BASE_URL;

public class ClassAttrTest {

    public static final String alertText = "Primary button pressed";

    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "classattr");
    }

    @Test
    public void clickPrimaryButtonTest() {
        ClassAttrPage classAttrPage = new ClassAttrPage();
        classAttrPage.clickPrimaryButton();
        assertEquals(alertText, classAttrPage.getTextFromAlert());
        classAttrPage.clickOkInAlert();
    }
}