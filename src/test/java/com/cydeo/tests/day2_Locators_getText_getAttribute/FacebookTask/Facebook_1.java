package com.cydeo.tests.day2_Locators_getText_getAttribute.FacebookTask;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_1 {
    public static void main(String[] args) {


       // TC #1: Facebook title verification
       // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com ");


       // 3. Verify title:
       // Expected: “Facebook - Log In or Sign Up”
        String expectedTitle= "Facebook - Log In or Sign Up";
        String actualTitle= driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("title verification passed");
        }else{
            System.out.println("title verification failed");
        }



    }
}
