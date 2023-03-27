package text_input_test;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import text_input_test.page.TextInputPage;

import static org.testng.AssertJUnit.assertEquals;
import static util.Constants.BASE_URL;

public class TextInputTest extends BaseTest {

    public static final String TEXT_INPUT_TEST_BUTTON = "TEXT_INPUT_TEST_BUTTON";

    @BeforeMethod
    @Override
    public void initMethod(){
        driver.get(BASE_URL + "textinput");
    }

    @Test
    public void testButtonClick(){
        TextInputPage textInputPage = new TextInputPage(driver);
        textInputPage.inputText(TEXT_INPUT_TEST_BUTTON);
        textInputPage.clickUpdateButton();
        assertEquals(textInputPage.getUpdateButtonText(), TEXT_INPUT_TEST_BUTTON);
    }
}
