package ajax_test;

import ajax_test.pages.AjaxDataPage;
import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class AjaxDataTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "ajax");
    }

    @Test
    public void testAjaxTest(){
        AjaxDataPage ajaxDataPage = new AjaxDataPage(driver);
        ajaxDataPage.clickTriggerButton();
        ajaxDataPage.waitForAjaxText();
    }
}
