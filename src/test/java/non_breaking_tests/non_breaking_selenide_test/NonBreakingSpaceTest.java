package non_breaking_tests.non_breaking_selenide_test;

import non_breaking_tests.non_breaking_selenide_test.page.NonBreakingSpacePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static util.Constants.BASE_URL;

public class NonBreakingSpaceTest {
    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "nbsp");
    }

    @Test
    public void nonBreakingSpaceTest() {
        NonBreakingSpacePage nonBreakingSpacePage = new NonBreakingSpacePage();
        nonBreakingSpacePage.clickButton();
    }
}
