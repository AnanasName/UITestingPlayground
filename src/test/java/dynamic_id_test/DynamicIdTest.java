package dynamic_id_test;

import base.BaseTest;
import dynamic_id_test.page.DynamicIdPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static util.Constants.BASE_URL;

public class DynamicIdTest extends BaseTest {

    @BeforeMethod
    @Override
    public void initMethod(){
        driver.get(BASE_URL + "dynamicid");
    }

    @Test
    public void testButtonClick(){
        DynamicIdPage dynamicIdPage = PageFactory.initElements(driver, DynamicIdPage.class);
        dynamicIdPage.clickButton();
    }
}
