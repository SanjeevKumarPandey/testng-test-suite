package com.testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SingleTest extends BrowserStackTestNGTest {

    @Test
    public void test() throws Exception {

        driver.get("https://www.browserstack.com/");
        String headerText = driver.findElement(By.id("primary-menu")).getText();
        Assert.assertTrue(headerText.contains("Sign in"));
        Assert.assertFalse(headerText.contains("Account"));
        WebElement mobile = driver.findElement(By.linkText("Mobile Features"));
        //mobile.click();
        /*
        [Mitigating the Webdriver Issue] - 
        "org.openqa.selenium.WebDriverException:
        unknown error: Element <a href="/mobile-features">...</a> is not clickable at point (245, 665). Other element would receive the click: <div class="cookie-notification">...</div>"
        */
        Actions actions = new Actions(driver);
        actions.moveToElement(mobile).click().perform();
        //mobile.sendKeys(Keys.ENTER);
        
        //updating the title
        Assert.assertEquals(driver.getTitle(),"All you need to test Responsive web design | BrowserStack");
        //Assert.assertEquals(driver.getTitle(), "Most Reliable Mobile App & Browser Testing Platform | BrowserStack");
        WebElement section = driver.findElement(By.xpath("//*[@id=\"post-20\"]/div[1]/div/div/div/article[2]/div/div/div/div[1]"));
        String link = section.findElement(By.cssSelector("a")).getAttribute("href");
        Assert.assertEquals(link, "https://www.browserstack.com/test-on-the-right-mobile-devices");
        /***
         * @author Sanjeev
         * @TODO Write more tests here
         * */
    }
}
