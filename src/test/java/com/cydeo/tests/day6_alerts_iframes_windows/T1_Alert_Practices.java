package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Alert_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open browser
        WebDriverManager.chromedriver().setup();
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: http://practice.cydeo.com/javascript_alerts
        driver.get("http://practice.cydeo.com/javascript_alerts");
    }


    @Test
    public void AlertPractice_test1() {
        //3. Click to “Click for JS Alert” button
        WebElement infoAlertButton = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        infoAlertButton.click();

        //4.This step allow us to switch drivers attention from html page to the alert
        Alert alert = driver.switchTo().alert();

        //4. Click to OK button from the alert
        alert.accept();
        //5. Verify “You successfully clicked an alert” text is displayed.
        WebElement alertText = driver.findElement(By.xpath("//p[@id='result']"));
// System.out.println(" \'You successfully clicked an alert\' text is displayed = " + alertText.isDisplayed());
        //failure message only be displayed if assertion fails
        Assert.assertTrue(alertText.isDisplayed(), "Result text is not displayed");

        //another way to verify alert text as expexted as it should be
        String expectedAlertText = "You successfully clicked an alert";
        String actualALertText = alertText.getText();
        Assert.assertEquals(expectedAlertText, actualALertText, "expected and actual result does not match");
    }


    @Test
    public void alertPractice_Test2() {
        //3. Click to “Click for JS Confirm” button
        WebElement clickForJsConfirmButton = driver.findElement(By.xpath("//button[.='Click for JS Confirm']"));
        clickForJsConfirmButton.click();
        //4. Click to OK button from the alert
        Alert confirmationAlert = driver.switchTo().alert();

        confirmationAlert.accept();
        //5. Verify “You clicked: Ok” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("(//p)[2]"));
        Assert.assertTrue(resultText.isDisplayed());
    }

    @Test
    public void promptAlertPractice() {

        //3. Click to “Click for JS Prompt” button

        WebElement clickForJsPromptButton = driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        clickForJsPromptButton.click();

        //4. Send “hello” text to alert
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("hello");

        //5. Click to OK button from the alert
        promptAlert.accept();
        //6. Verify “You entered:  hello” text is displayed.
        WebElement resultText = driver.findElement(By.xpath("(//p)[2]"));

        Assert.assertTrue(resultText.isDisplayed());


    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}

/*
TC #1: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Alert” button
4. Click to OK button from the alert
5. Verify “You successfully clicked an alert” text is displayed.
 */
//--------------------------------------------------
/*TC #2: Confirmation alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Confirm” button
4. Click to OK button from the alert
5. Verify “You clicked: Ok” text is displayed. */

//-----------------------------------------------------
/*TC #3: Information alert practice
1. Open browser
2. Go to website: http://practice.cydeo.com/javascript_alerts
3. Click to “Click for JS Prompt” button
4. Send “hello” text to alert
5. Click to OK button from the alert
6. Verify “You entered:  hello” text is displayed.
 */