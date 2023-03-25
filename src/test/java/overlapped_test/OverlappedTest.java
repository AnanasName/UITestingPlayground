package overlapped_test;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import overlapped_test.page.OverlappedPage;

import static util.Constants.BASE_URL;

public class OverlappedTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "overlapped");
    }

    @Test
    public void testLoadDelay(){
        String textToTest = "My Name";
        OverlappedPage overlappedPage = new OverlappedPage(driver);
        overlappedPage.scrollToNameInput();
        overlappedPage.typeTextInNameInput(textToTest);
        overlappedPage.assertTextInNameInputCorrect(textToTest);
        overlappedPage.assertThatNameInputIsVisible();
    }
}
