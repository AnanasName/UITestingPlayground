package progress_bar_test;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import progress_bar_test.page.ProgressBarPage;

import static util.Constants.BASE_URL;

public class ProgressBarTest extends BaseTest {
    @BeforeMethod
    public void initMethod() {
        driver.get(BASE_URL + "progressbar");
    }

    @Test
    public void testProgressBar() {
        ProgressBarPage progressBarPage = new ProgressBarPage(driver);
        progressBarPage.clickStartButton();
        progressBarPage.waitForProgressBarValue("75%");
        progressBarPage.clickStopButton();
    }
}
