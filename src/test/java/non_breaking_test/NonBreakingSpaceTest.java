package non_breaking_test;

import base.BaseTest;
import non_breaking_test.page.NonBreakingSpacePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class NonBreakingSpaceTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "nbsp");
    }

    @Test
    public void nonBreakingSpaceTest(){
        NonBreakingSpacePage nonBreakingSpacePage = new NonBreakingSpacePage(driver);
        nonBreakingSpacePage.clickButton();
    }
}
