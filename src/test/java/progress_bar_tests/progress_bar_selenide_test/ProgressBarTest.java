package progress_bar_tests.progress_bar_selenide_test;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import progress_bar_tests.progress_bar_selenide_test.page.ProgressBarPage;

import static com.codeborne.selenide.Selenide.open;
import static util.Constants.BASE_URL;

public class ProgressBarTest {
    public static final String PROGRESS_BAR_VALUE = "75%";

    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "progressbar");
    }

    @Test
    public void testProgressBar() {
        ProgressBarPage progressBarPage = new ProgressBarPage();
        progressBarPage.clickStartButton();
        progressBarPage.waitForProgressBarValue(WebDriverRunner.getWebDriver(), PROGRESS_BAR_VALUE);
        progressBarPage.clickStopButton();
    }
}
