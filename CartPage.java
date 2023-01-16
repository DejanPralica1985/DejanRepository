package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage (WebDriver driver){
        super (driver);
    }

    By checkoutButtonBy = By.id("checkout");

    public CartPage verifyProceedToYourCart (String expectedText){
        String actualText = readText(pageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }
    
    public CartPage clickCheckout(){
        click(checkoutButtonBy);
        return this;
    }    
}
