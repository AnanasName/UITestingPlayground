package text_input_tests.text_input_selenide_test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import text_input_tests.text_input_selenide_test.page.TextInputPage;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertEquals;
import static util.Constants.BASE_URL;

public class TextInputTest {

    public static final String TEXT_INPUT_TEST_BUTTON = "TEXT_INPUT_TEST_BUTTON";

    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "textinput");
    }

    @Test
    public void testButtonClick() {
        TextInputPage textInputPage = new TextInputPage();
        textInputPage.inputText(TEXT_INPUT_TEST_BUTTON);
        textInputPage.clickUpdateButton();
        assertEquals(textInputPage.getUpdateButtonText(), TEXT_INPUT_TEST_BUTTON);
    }
}
