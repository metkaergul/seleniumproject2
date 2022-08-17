package com.cydeo.tests.day2_Locators_getText_getAttribute;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_2 {
    public static void main(String[] args) {


        //  TC #2: Zero Bank header verification
        //  1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  2. Go to http://zero.webappsecurity.com/login.html

        driver.get(" http://zero.webappsecurity.com/login.html ");

        //  3. Verify header text
        //  Expected: “Log in to ZeroBank”
       WebElement header=  driver.findElement(By.tagName("h3"));

       String headerText= header.getText();
       String expectedHeader= "Log in to ZeroBank";

       if(headerText.equals(expectedHeader)){
           System.out.println("header text verification passed");
       }else{
           System.out.println("header text verification failed");
       }





    }
}
