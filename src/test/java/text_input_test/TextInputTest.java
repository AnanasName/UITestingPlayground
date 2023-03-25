package text_input_test;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import text_input_test.page.TextInputPage;

import static util.Constants.BASE_URL;

public class TextInputTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "textinput");
    }

    @Test
    public void testButtonClick(){
        String testText = "Some text to button";
        TextInputPage textInputPage = new TextInputPage(driver);
        textInputPage.inputText(testText);
        textInputPage.clickUpdateButton();
        textInputPage.assertButton(testText);
    }
}
