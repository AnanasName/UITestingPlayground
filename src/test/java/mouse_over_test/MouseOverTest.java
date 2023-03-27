package mouse_over_test;

import base.BaseTest;
import mouse_over_test.page.MouseOverPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class MouseOverTest extends BaseTest {

    public static final int CLICKS_COUNT = 1;

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("mouseover");
    }

    @Test
    public void testLoadDelay() {
        MouseOverPage mouseOverPage = PageFactory.initElements(driver, MouseOverPage.class);
        mouseOverPage.clickOnRef();
        assertEquals(String.valueOf(CLICKS_COUNT), mouseOverPage.getTimesCount());
    }
}
