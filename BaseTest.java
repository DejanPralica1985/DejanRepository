package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
    
    public WebDriver driver;

    String correctUsername = "standard_user";
    String correctpassword = "secret_sauce";

    String firstName = "Dejan";
    String lastName = "Pralica";
    String postalCode = "26000";

    String expectedText = "PRODUCTS";
    String expectedTextCart = "YOUR CART";
    String expectedTextInfo = "CHECKOUT: YOUR INFORMATION";
    String expectedTextOverview = "CHECKOUT: OVERVIEW";
    String expectedTextHeader = "THANK YOU FOR YOUR ORDER";

    
    @Before
    public void setup (){
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\User\\Desktop\\TestPrjctDP\\TestProject\\lib\\geckodriver.exe");
        //driver = new FirefoxDriver();
        //driver.manage().window().maximize();
        System.setProperty("webdriver.chromedriver", "C:\\Users\\User\\Desktop\\TestPrjctDP\\TestProject\\lib\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void teardown (){
        driver.quit();
    }
}
