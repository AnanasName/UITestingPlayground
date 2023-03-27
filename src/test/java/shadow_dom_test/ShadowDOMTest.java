package shadow_dom_test;

import base.BaseTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import shadow_dom_test.page.ShadowDOMPage;

//TODO исправить логику
public class ShadowDOMTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod(){
        getPath("shadowdom");
    }

    @Test
    public void testShadowDom(){
        ShadowDOMPage shadowDOMPage = PageFactory.initElements(driver, ShadowDOMPage.class);
        shadowDOMPage.clickGenerateButton();
        shadowDOMPage.clickCopyButton();

//        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
//        Transferable contents = clipboard.getContents(null);
//        String x = (String) contents.getTransferData(DataFlavor.stringFlavor);
    }
}
