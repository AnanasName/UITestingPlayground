package click_test;

import base.BaseTest;
import click_test.poms.ClickButtonPage;
import dynamic_id_test.poms.DynamicIdPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class ClickButtonTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "click");
    }

    @Test
    public void testButtonClick(){
        ClickButtonPage clickButtonPage = new ClickButtonPage(driver);
        clickButtonPage.clickButton();
        clickButtonPage.clickButtonPhysical();
    }
}
