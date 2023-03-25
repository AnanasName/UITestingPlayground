package class_attr_test;

import base.BaseTest;
import class_attr_test.page.ClassAttrPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class ClassAttrTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "classattr");
    }

    @Test
    public void clickPrimaryButtonTest(){
        ClassAttrPage classAttrPage = new ClassAttrPage(driver);
        classAttrPage.clickPrimaryButton();
        classAttrPage.assertTextInAlert("Primary button pressed");
        classAttrPage.clickOkInAlert();
    }
}