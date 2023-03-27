package overlapped_test;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import overlapped_test.page.OverlappedPage;

import static org.testng.AssertJUnit.assertTrue;

public class OverlappedTest extends BaseTest {

    public static final String OVERLAPPED_TEST_TEXT = "OVERLAPPED_TEST_TEXT";

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("overlapped");
    }

    @Test
    public void testLoadDelay() {
        OverlappedPage overlappedPage = PageFactory.initElements(driver, OverlappedPage.class);
        overlappedPage.scrollToNameInput();
        overlappedPage.typeTextInNameInput(OVERLAPPED_TEST_TEXT);
        overlappedPage.assertTextInNameInputCorrect(OVERLAPPED_TEST_TEXT);
        assertTrue(overlappedPage.isNameInputDisplayed());
    }
}
