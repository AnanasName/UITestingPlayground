package non_breaking_tests.non_breaking_selenium_test;

import base.base_selenium.BaseTest;
import non_breaking_tests.non_breaking_selenium_test.page.NonBreakingSpacePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NonBreakingSpaceTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("nbsp");
    }

    @Test
    public void nonBreakingSpaceTest() {
        NonBreakingSpacePage nonBreakingSpacePage = PageFactory.initElements(driver, NonBreakingSpacePage.class);
        nonBreakingSpacePage.clickButton();
    }
}
