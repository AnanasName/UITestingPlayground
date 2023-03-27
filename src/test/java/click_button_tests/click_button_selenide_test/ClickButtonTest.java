package click_button_tests.click_button_selenide_test;

import click_button_tests.click_button_selenide_test.page.ClickButtonPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static util.Constants.BASE_URL;

public class ClickButtonTest {
    @BeforeMethod
    public void initMethod(){
        open(BASE_URL + "click");
    }

    @Test
    public void testButtonClick(){
        new ClickButtonPage().clickButton();
    }
}
