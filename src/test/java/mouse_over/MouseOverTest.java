package mouse_over;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import mouse_over.poms.MouseOverPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import overlapped_test.poms.OverlappedPage;

import static util.Constants.BASE_URL;

public class MouseOverTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "mouseover");
    }

    @Test
    public void testLoadDelay(){
        MouseOverPage mouseOverPage = new MouseOverPage(driver);
        mouseOverPage.clickOnRef();
    }
}
