package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage (WebDriver driver){
        super(driver);
    }

    By hamburgerMenuBy = By.id("react-burger-menu-btn");
    By logoutButtonBy = By.id("logout_sidebar_link");
    By numberOfItemsBy = By.className("inventory_item");
    By shoppingCartIconBy =By.className("shopping_cart_link");
    By addToCartButton1By = By.id("add-to-cart-sauce-labs-backpack");
    By addToCartButton2By = By.id("add-to-cart-sauce-labs-bike-light");
    By removeButton1By = By.id("remove-sauce-labs-backpack");
    By removeButton2By = By.id("remove-sauce-labs-bike-light");
    By shoppingCartBadgeBy = By.className("shopping_cart_badge");

    public HomePage verifySuccesfullLogin (String expectedText){
        String actualText = readText(pageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }

    public HomePage clickOnLogoutButton (){
        click(hamburgerMenuBy);
        click(logoutButtonBy);
        return this;
    }

    public HomePage itemsCounter (int expectedNumberOfProducts){
        int actualNumberOfProducts = countItems(numberOfItemsBy);
        assrtIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
    
    public HomePage verify2ProductsAddedToCart(){
        click(addToCartButton1By);
        //waitVisabiity(removeButton1By);
        click(addToCartButton2By);
        //waitVisabiity(removeButton2By);
        waitVisabiity(shoppingCartBadgeBy);
        return this;
    }

    public HomePage clickOnShoppingCartIcon(){
        click(shoppingCartIconBy);
        return this;
    }
}
