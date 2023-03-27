package ajax_test;

import ajax_test.pages.AjaxDataPage;
import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class AjaxDataTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        driver.get(BASE_URL + "ajax");
    }

    @Test
    public void testAjaxTest() {
        AjaxDataPage ajaxDataPage = PageFactory.initElements(driver, AjaxDataPage.class);
        ajaxDataPage.clickTriggerButton();
        ajaxDataPage.waitForAjaxText();
    }
}
