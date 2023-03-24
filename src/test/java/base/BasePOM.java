package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePOM {

    protected WebDriver driver;

    public BasePOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
