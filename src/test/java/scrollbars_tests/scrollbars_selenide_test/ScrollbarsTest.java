package scrollbars_tests.scrollbars_selenide_test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import scrollbars_tests.scrollbars_selenide_test.page.ScrollbarsPage;

import static com.codeborne.selenide.Selenide.open;
import static util.Constants.BASE_URL;

public class ScrollbarsTest {
    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "scrollbars");
    }

    @Test
    public void testScrollbars() {
        ScrollbarsPage scrollbarsPage = new ScrollbarsPage();
        scrollbarsPage.moveToTargetButton();
        scrollbarsPage.clickTargetButton();
    }
}
