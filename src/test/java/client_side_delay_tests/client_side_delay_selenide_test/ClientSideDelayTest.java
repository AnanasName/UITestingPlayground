package client_side_delay_tests.client_side_delay_selenide_test;

import client_side_delay_tests.client_side_delay_selenide_test.page.ClientSideDelayPage;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.testng.AssertJUnit.assertTrue;
import static util.Constants.BASE_URL;

public class ClientSideDelayTest {
    public static final String SUCCESS_MESSAGE_TEXT = "Data calculated on the client side.";

    @BeforeMethod
    public void initMethod() {
        open(BASE_URL + "clientdelay");
    }

    @Test
    public void clientSideDelayTest() {
        ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage();
        clientSideDelayPage.clickTestTargetButton();
        clientSideDelayPage.waitForMessage(WebDriverRunner.getWebDriver());
        assertTrue(clientSideDelayPage.getSuccessMessageText().contains(SUCCESS_MESSAGE_TEXT));
    }
}
