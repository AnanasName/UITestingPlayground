package mouse_over_tests.mouse_over_selenide_test;

import mouse_over_tests.mouse_over_selenide_test.page.MouseOverPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertEquals;
import static util.Constants.BASE_URL;

public class MouseOverTest {
    public static final int CLICKS_COUNT = 1;

    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "mouseover");
    }

    @Test
    public void testLoadDelay() {
        MouseOverPage mouseOverPage = new MouseOverPage();
        mouseOverPage.clickOnRef();
        assertEquals(String.valueOf(CLICKS_COUNT), mouseOverPage.getTimesCount());
    }
}
