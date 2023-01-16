package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTests extends BaseTest{
    public LoginPage loginPage;
    public HomePage homePage;
    int totalItems = 6;

    @Test
    public void verifyLogout (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(correctUsername, correctpassword);
        homePage.verifySuccesfullLogin(expectedText);
        homePage.clickOnLogoutButton();
        loginPage.verifyLogout();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void verifyTotalOfItems (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(correctUsername, correctpassword);
        homePage.verifySuccesfullLogin(expectedText);
        homePage.itemsCounter(totalItems);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void succesfullAddToCart2Products(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.basePage();
        loginPage.login(correctUsername, correctpassword);
        homePage.verifySuccesfullLogin(expectedText);
        homePage.verify2ProductsAddedToCart();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
