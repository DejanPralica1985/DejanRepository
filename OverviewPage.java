package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPage extends BasePage{
    public OverviewPage (WebDriver driver){
        super(driver);
    }

    By p1 = By.xpath("//*[@id='checkout_summary_container']/div/div[1]/div[3]/div[2]/div[2]/div");
    By p2 = By.xpath("//*[@id='checkout_summary_container']/div/div[1]/div[4]/div[2]/div[2]/div");
    By subtotalLabelBy = By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[5]");
    By taxLabelBy = By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[6]");
    By totalLabelBy = By.xpath("//*[@id='checkout_summary_container']/div/div[2]/div[7]");

    By finishButtonBy = By.id("finish");

    public OverviewPage verifyProceedToCheckoutOverview (String expectedText){
        String actualText = readText(pageTitleBy);
        assertTextEquals(expectedText, actualText);
        return this;
    }
    
    public OverviewPage verifyTotalPrice (){
        double price1 = Double.parseDouble(readText(p1).substring(1));
        double price2 = Double.parseDouble(readText(p2).substring(1));
        double expectedSubtotal = price1 + price2;
        double actualSubtotal = Double.parseDouble(readText(subtotalLabelBy).substring(13));
        assertDoubleEquals(expectedSubtotal, actualSubtotal);

        double tax = Double.parseDouble(readText(taxLabelBy).substring(6));
        double expectedTotal = actualSubtotal + tax;
        double acttualTotal = Double.parseDouble(readText(totalLabelBy).substring(8));
        assertDoubleEquals(expectedTotal, acttualTotal);
        return this;
    }

    public OverviewPage clickToFinish (){
        click(finishButtonBy);
        return this;
    }
}
