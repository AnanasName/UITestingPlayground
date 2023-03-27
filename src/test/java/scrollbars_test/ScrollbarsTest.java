package scrollbars_test;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scrollbars_test.page.ScrollbarsPage;

import static util.Constants.BASE_URL;

public class ScrollbarsTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        driver.get(BASE_URL + "scrollbars");
    }

    @Test
    public void testScrollbars(){
        ScrollbarsPage scrollbarsPage = PageFactory.initElements(driver, ScrollbarsPage.class);
        scrollbarsPage.moveToTargetButton();
        scrollbarsPage.clickTargetButton();
    }
}
