package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Task1_WindowHandling {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open browser
        WebDriverManager.chromedriver().setup();
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to: https://www.amazon.com
        driver.get("https://www.amazon.com");

    }


    @Test
    public void window_handling_test() {
       // 3. Copy paste the lines from below into your class
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        //4. Create a logic to switch to the tab where Etsy.com is open
      /*  Set<String> allWindowHandles = driver.getWindowHandles();
        for (String eachWindow : allWindowHandles) {

            driver.switchTo().window(eachWindow);
            System.out.println("current url:" + driver.getCurrentUrl());
            if (driver.getCurrentUrl().contains("etsy")) {
                break;
            }


        }
        //5. Assert: Title contains “Etsy”
        String actualCurrentTitle= driver.getTitle();
        String expectedInTitle= "etsy";
        Assert.assertTrue(actualCurrentTitle.contains(expectedInTitle));*/
        BrowserUtils.switchWindowAndVerify(driver,"etsy","Etsy");
    }
//    @AfterMethod
//    public void tearDown(){
//
//        driver.close();
//    }


}


/*TC #1: Window Handle practice
 1. Create new test and make set ups
2. Go to : https://www.amazon.com
3. Copy paste the lines from below into your class
4. Create a logic to switch to the tab where Etsy.com is open
5. Assert: Title contains “Etsy”

Lines to be pasted:
((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");

These lines will simply open new tabs using something called JavascriptExecutor
and get those pages. We will learn JavascriptExecutor later as well.
 */
