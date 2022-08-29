package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

     WebDriver driver; //class level driver help us to utilize webdriver inside  method
    @BeforeMethod
    public void beforeMethod(){

//do browser driver setup
        //open browser
         driver = WebDriverFactory.getDriver("chrome");
        //maximize the page
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){

        driver.quit();
    }


    @Test
    public void selenium_test(){

        //get "https://www.google.com"
        driver.get("https://www.google.com");
        ///assert title is "Google"
        String expectedTitle= "Google";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"title is not matching");
    }
}
