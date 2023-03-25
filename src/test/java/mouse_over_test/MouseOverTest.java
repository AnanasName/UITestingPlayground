package mouse_over_test;

import base.BaseTest;
import mouse_over_test.page.MouseOverPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class MouseOverTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "mouseover");
    }

    @Test
    public void testLoadDelay(){
        MouseOverPage mouseOverPage = new MouseOverPage(driver);
        mouseOverPage.clickOnRef();
    }
}
