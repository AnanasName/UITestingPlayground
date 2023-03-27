package util;


import org.openqa.selenium.WebDriver;

public class UtilPageFunctions {
    public static void clickOnAlert(WebDriver driver){
        driver.switchTo().alert().accept();
    }

    public static String getAlertText(WebDriver driver){
        return driver.switchTo().alert().getText();
    }
}
