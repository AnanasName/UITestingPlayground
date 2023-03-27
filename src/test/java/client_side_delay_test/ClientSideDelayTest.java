package client_side_delay_test;

import base.BaseTest;
import client_side_delay_test.page.ClientSideDelayPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;
import static util.Constants.BASE_URL;

public class ClientSideDelayTest extends BaseTest {

    public static final String SUCCESS_MESSAGE_TEXT = "Data calculated on the client side.";

    @BeforeMethod
    @Override
    public void initMethod() {
        driver.get(BASE_URL + "clientdelay");
    }

    @Test
    public void clientSideDelayTest(){
        ClientSideDelayPage clientSideDelayPage = new ClientSideDelayPage(driver);
        clientSideDelayPage.clickTestTargetButton();
        clientSideDelayPage.waitForMessage();
        assertTrue(clientSideDelayPage.getSuccessMessageText().contains(SUCCESS_MESSAGE_TEXT));
    }
}
