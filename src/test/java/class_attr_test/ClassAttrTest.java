package class_attr_test;

import base.BaseTest;
import class_attr_test.poms.ClassAttrPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import mouse_over.poms.MouseOverPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
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