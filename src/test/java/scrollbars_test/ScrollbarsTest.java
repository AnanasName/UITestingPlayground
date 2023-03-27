package scrollbars_test;

import base.base_selenium.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scrollbars_test.page.ScrollbarsPage;

public class ScrollbarsTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("scrollbars");
    }

    @Test
    public void testScrollbars(){
        ScrollbarsPage scrollbarsPage = PageFactory.initElements(driver, ScrollbarsPage.class);
        scrollbarsPage.moveToTargetButton();
        scrollbarsPage.clickTargetButton();
    }
}
