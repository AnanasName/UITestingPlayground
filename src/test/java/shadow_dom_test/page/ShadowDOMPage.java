package shadow_dom_test.page;

import base.base_selenium.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ShadowDOMPage extends BasePage {

    private final WebElement generateButton;
    private final WebElement copyButton;
    private final WebElement inputField;

    public ShadowDOMPage(WebDriver driver) {
        super(driver);
        WebElement shadowHost = driver.findElement(By.tagName("guid-generator"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        generateButton = shadowRoot.findElement(By.className("button-generate"));
        copyButton = shadowRoot.findElement(By.className("button-copy"));
        inputField = shadowRoot.findElement(By.className("edit-field"));
//        generateButton = shadowRoot.findElement(By.xpath("//button[@id='buttonGenerate']"));
//        copyButton = shadowRoot.findElement(By.xpath("//button[@id='buttonCopy']"));
//        inputField = shadowRoot.findElement(By.xpath("//button[@id='editField']"));
    }

    public void clickGenerateButton() {
        generateButton.click();
    }

    public void clickCopyButton() {
        copyButton.click();
    }

    public void assertTextInInputField(String text) {
        assertThat(inputField.getText().equals(text));
    }
}
