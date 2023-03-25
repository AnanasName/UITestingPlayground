package click_test;

import base.BaseTest;
import click_test.page.ClickButtonPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class ClickButtonTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "click");
    }

    @Test
    public void testButtonClick(){
        ClickButtonPage clickButtonPage = new ClickButtonPage(driver);
        clickButtonPage.clickButton();
        clickButtonPage.clickButtonPhysical();
    }
}
