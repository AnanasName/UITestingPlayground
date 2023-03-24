package load_delay.poms;

import base.BasePOM;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class MainPage extends BasePOM {

    @FindBy(xpath = "//*[@href=\"/loaddelay\"]")
    private WebElement loadDelayRef;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickLoadDelayRefAndWaitForNewPage(){
        loadDelayRef.click();
        Wait<WebDriver> wait = new FluentWait<>(driver)

                .withTimeout(Duration.ofSeconds(15))

                .pollingEvery(Duration.ofSeconds(3))

                .ignoring(NoSuchElementException.class);

        wait.until(driver -> driver.findElement(By.className("btn-primary")));
    }
}
