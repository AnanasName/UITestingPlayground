package overlapped_test;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import overlapped_test.page.OverlappedPage;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;
import static util.Constants.BASE_URL;

public class OverlappedTest extends BaseTest {

    public static final String OVERLAPPED_TEST_TEXT = "OVERLAPPED_TEST_TEXT";

    @BeforeMethod
    public void initMethod() {
        driver.get(BASE_URL + "overlapped");
    }

    @Test
    public void testLoadDelay() {
        OverlappedPage overlappedPage = new OverlappedPage(driver);
        overlappedPage.scrollToNameInput();
        overlappedPage.typeTextInNameInput(OVERLAPPED_TEST_TEXT);
        overlappedPage.assertTextInNameInputCorrect(OVERLAPPED_TEST_TEXT);
        assertTrue(overlappedPage.isNameInputDisplayed());
    }
}
