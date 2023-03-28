package client_side_delay_tests.client_side_delay_selenium_test;

import base.base_selenium.BaseTest;
import client_side_delay_tests.client_side_delay_selenium_test.page.ClientSideDelayPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ClientSideDelayTest extends BaseTest {

    public static final String SUCCESS_MESSAGE_TEXT = "Data calculated on the client side.";

    @BeforeMethod
    @Override
    public void initMethod() {
        getPath("clientdelay");
    }

    @Test
    public void clientSideDelayTest() {
        ClientSideDelayPage clientSideDelayPage = PageFactory.initElements(driver, ClientSideDelayPage.class);
        clientSideDelayPage.clickTestTargetButton();
        clientSideDelayPage.waitForMessage();
        assertTrue(clientSideDelayPage.getSuccessMessageText().contains(SUCCESS_MESSAGE_TEXT));
    }
}
