package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CompletePage extends BasePage{
    public CompletePage (WebDriver driver){
        super(driver);
    }

    By completePageHeaderBy = By.className("complete-header");

    public CompletePage verifyOrderCompleting (String expectedText){
        String actualText = readText(completePageHeaderBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }    
}
