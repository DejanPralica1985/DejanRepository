package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTests extends BaseTest{

    public LoginPage loginPage;
    String emptyUsername = "";
    String emptyUsernameError = "Epic sadface: Username is required";
    String emptyPassword = "";
    String emptyPasswordError = "Epic sadface: Password is required";
    String wrongUsername = "try";
    String wrongUsernamePasswordError = "Epic sadface: Username and password do not match any user in this service";
    String wrongPassword = "try";

    @Test
    public void navigateToLoginPage(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    
    @Test
    public void verifySuccesfullLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.basePage();
        loginPage.login(correctUsername, correctpassword);
        homePage.verifySuccesfullLogin(expectedText);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void emptyUsernameLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(emptyUsername, correctpassword);
        loginPage.verifyUnsuccesfullLogin(emptyUsernameError);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void emptyPasswordLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(correctUsername, emptyPassword);
        loginPage.verifyUnsuccesfullLogin(emptyPasswordError);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void wrongUsernameLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(wrongUsername, correctpassword);
        loginPage.verifyUnsuccesfullLogin(wrongUsernamePasswordError);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Test
    public void wrongPasswordLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.basePage();
        loginPage.login(correctUsername, wrongPassword);
        loginPage.verifyUnsuccesfullLogin(wrongUsernamePasswordError);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
