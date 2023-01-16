package tests;

import org.junit.Test;

import pages.CartPage;
import pages.HomePage;
import pages.InfoPage;
import pages.LoginPage;
import pages.OverviewPage;

public class OverviewTests extends BaseTest{
    public LoginPage loginPage;
    public HomePage homePage;
    public CartPage cartPage;
    public InfoPage infoPage;
    public OverviewPage overviewPage;

    @Test
    public void verifyTotalPrice (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        CartPage cartPage = new CartPage(driver);
        InfoPage infoPage = new InfoPage(driver);
        OverviewPage overviewPage = new OverviewPage(driver);

        loginPage.basePage();
        loginPage.login(correctUsername, correctpassword);
        homePage.verifySuccesfullLogin(expectedText);
        homePage.verify2ProductsAddedToCart();
        homePage.clickOnShoppingCartIcon();
        //cartPage.verifyProceedToYourCart(expectedTextCart);
        cartPage.clickCheckout();
        //infoPage.verifyProceedToCheckoutInfo(expectedTextInfo);
        infoPage.insertInfos(firstName, lastName, postalCode);
        infoPage.clickToContinue();
        //overviewPage.verifyProceedToCheckoutOverview(expectedTextOverview);
        overviewPage.verifyTotalPrice();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }    
}
