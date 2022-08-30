package com.cydeo.tests.alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iframe_Practice {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open browser
        WebDriverManager.chromedriver().setup();
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Go to: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe ");


    }

    @Test
    public void Iframe_Test(){


        //we need to switch driver focus to id
        //option#1 :switching to iframe using  id attribute value
       // driver.switchTo().frame("mce_0_ifr");

        //option#2 :switching to iframe passing index number of iframe
        //driver.switchTo().frame(0);

        //option#3 :switching to iframe passing WebElement into frameConstructor
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //locate the <p> tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());



        //verify this header "An iFrame containing the TinyMCE WYSIWYG Editor" is displayed
        //in order to verify it first we need to switch our drivers attention back to main html page
        driver.switchTo().parentFrame();

       WebElement iframeHeaderText= driver.findElement(By.xpath("//h3[.='An iFrame containing the TinyMCE WYSIWYG Editor']"));
       //assertion of header text is displayed or not
       Assert.assertTrue(iframeHeaderText.isDisplayed());


    }

}


/*TC #4: Iframe practice

1. Create a new class called: T4_Iframes
2. Create new test and make set ups
3. Go to: https://practice.cydeo.com/iframe
4. Assert: “Your content goes here.” Text is displayed.
5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor” */