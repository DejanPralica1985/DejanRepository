package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


public class BasePage {
    
    public WebDriver driver;
    public WebDriverWait wait;

    By  pageTitleBy = By.xpath("//*[@id='header_container']/div[2]/span");

    public BasePage (WebDriver driver){
        this.driver = driver;
        wait =new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void waitVisabiity (By elementBy){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void writeText(By elementBy,String text){
        waitVisabiity(elementBy);
        driver.findElement(elementBy).clear();
        driver.findElement(elementBy).sendKeys(text);
    }
     public void click (By elementBy){
        waitVisabiity(elementBy);
        driver.findElement(elementBy).click();
    }

    public String readText (By elementBy){
        waitVisabiity(elementBy);
        return driver.findElement(elementBy).getText();
    }

    public void assertTextEquals (String expectedText, String ActualText){
        Assert.assertEquals(expectedText, ActualText);
    }

    public int countItems (By elementBy){
        waitVisabiity(elementBy);
        return driver.findElements(elementBy).size();
    }

    public void assrtIntegerEquals (int expectedNumber, int actualNumber){
        Assert.assertEquals(expectedNumber, actualNumber);
    }

    public void assertDoubleEquals (double expectedNumber, double actualNumber){
        Assert.assertEquals(expectedNumber, actualNumber, 0.00001);
    }
}
