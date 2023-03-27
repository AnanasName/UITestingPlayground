package dynamic_id_tests.dynamic_id_selenium_test;

import base.BaseTest;
import dynamic_id_tests.dynamic_id_selenium_test.page.DynamicIdPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicIdTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("dynamicid");
    }

    @Test
    public void testButtonClick() {
        DynamicIdPage dynamicIdPage = PageFactory.initElements(driver, DynamicIdPage.class);
        dynamicIdPage.clickButton();
    }
}
