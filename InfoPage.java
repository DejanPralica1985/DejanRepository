package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InfoPage extends BasePage{
    public InfoPage (WebDriver driver){
        super(driver);
    }
    
    By firstNameBy = By.id("first-name");
    By lastNameBy = By.id("last-name");
    By postalCodeBy = By.id("postal-code");

    By continueButtonBy = By.id("continue");

    public InfoPage verifyProceedToCheckoutInfo (String expectedText){
        String actualText = readText(pageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }
    
    public InfoPage insertInfos ( String firstName, String lastName, String postalCode ){
        writeText(firstNameBy, firstName);
        writeText(lastNameBy, lastName);
        writeText(postalCodeBy, postalCode);
        return this;
    }

    public InfoPage clickToContinue(){
        click(continueButtonBy);
        return this;
    }
}
