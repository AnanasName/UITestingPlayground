package base.base_selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static util.Constants.BASE_URL;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void initClass(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public abstract void initMethod();

    public void getPath(String path){
        driver.get(BASE_URL + path);
    }

    @BeforeMethod
    public void initBaseMethod() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void destroyBaseMethod(){
        driver.close();
    }
}
