package ajax_tests.ajax_selenide_test;

import ajax_tests.ajax_selenide_test.pages.AjaxDataPage;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static util.Constants.BASE_URL;

public class AjaxDataTest {
    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "ajax");
    }

    @Test
    public void testAjaxTest() {
        AjaxDataPage ajaxDataPage = new AjaxDataPage();
        ajaxDataPage.clickTriggerButton();
        ajaxDataPage.waitForAjaxText(WebDriverRunner.getWebDriver());
    }
}
