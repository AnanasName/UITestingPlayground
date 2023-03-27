package non_breaking_test;

import base.BaseTest;
import non_breaking_test.page.NonBreakingSpacePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class NonBreakingSpaceTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        driver.get(BASE_URL + "nbsp");
    }

    @Test
    public void nonBreakingSpaceTest() {
        NonBreakingSpacePage nonBreakingSpacePage = PageFactory.initElements(driver, NonBreakingSpacePage.class);
        nonBreakingSpacePage.clickButton();
    }
}
