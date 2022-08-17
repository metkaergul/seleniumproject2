package com.cydeo.tests.day2_Locators_getText_getAttribute.FacebookTask;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_2 {
    public static void main(String[] args) {
        // TC #2: Facebook incorrect login title verification
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Enter incorrect username
       WebElement userNameInputBox= driver.findElement(By.id("email"));
            userNameInputBox.sendKeys("incorrectUserName");
        // 4. Enter incorrect password
        WebElement passwordInputBox= driver.findElement(By.name("pass"));
        passwordInputBox.sendKeys("incorrectPassword"+ Keys.ENTER);

        //5. Verify title changed to:
        //Expected: “Log into Facebook”

        String expectedTitle="Log in to Facebook";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("title verification passed");
        }else{
            System.out.println("title verification failed");
        }
    }
}
