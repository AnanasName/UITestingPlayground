package click_button_tests.click_button_selenium_test;

import base.BaseTest;
import click_button_tests.click_button_selenium_test.page.ClickButtonPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickButtonTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod(){
        getPath("click");
    }

    @Test
    public void testButtonClick(){
        ClickButtonPage clickButtonPage = PageFactory.initElements(driver, ClickButtonPage.class);
        clickButtonPage.clickButton();
        clickButtonPage.clickButtonPhysical();
    }
}
