package ajax_tests.ajax_selenium_test;

import ajax_tests.ajax_selenium_test.pages.AjaxDataPage;
import base.base_selenium.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AjaxDataTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("ajax");
    }

    @Test
    public void testAjaxTest() {
        AjaxDataPage ajaxDataPage = PageFactory.initElements(driver, AjaxDataPage.class);
        ajaxDataPage.clickTriggerButton();
        ajaxDataPage.waitForAjaxText();
    }
}
