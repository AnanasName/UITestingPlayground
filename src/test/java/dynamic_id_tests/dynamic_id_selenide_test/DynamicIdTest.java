package dynamic_id_tests.dynamic_id_selenide_test;

import dynamic_id_tests.dynamic_id_selenide_test.page.DynamicIdPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static util.Constants.BASE_URL;

public class DynamicIdTest{

    @BeforeMethod
    public void initMethod(){
        open(BASE_URL + "dynamicid");
    }

    @Test
    public void testButtonClick(){
        new DynamicIdPage().clickButton();
    }
}
