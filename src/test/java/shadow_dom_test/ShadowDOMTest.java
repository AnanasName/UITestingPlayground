package shadow_dom_test;

import base.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import shadow_dom_test.page.ShadowDOMPage;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import static util.Constants.BASE_URL;

public class ShadowDOMTest extends BaseTest {

    @BeforeMethod
    public void initMethod(){
        driver.get(BASE_URL + "shadowdom");
    }

    @Test
    public void testShadowDom() throws IOException, UnsupportedFlavorException {
        ShadowDOMPage shadowDOMPage = new ShadowDOMPage(driver);
        shadowDOMPage.clickGenerateButton();
        shadowDOMPage.clickCopyButton();

        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        Transferable contents = clipboard.getContents(null);
        String x = (String) contents.getTransferData(DataFlavor.stringFlavor);
        System.out.println(x);


    }
}
