package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {



//        TC #1: Yahoo Title Verification


        //1- Open Chrome browser

        // first thing we have to  do is to set up browser driver
        WebDriverManager.chromedriver().setup();

        // then we create instances of the selenium web driver
        //it opens Chrome browser
        WebDriver driver = new ChromeDriver();

        //in order to maximize the page opened
        driver.manage().window().maximize();


        //- Go to https://www.yahoo.com
        driver.get("https://yahoo.com");


        //3- Verify title:
        //   Expected: Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";


        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("actualTitle match with the  expectedTitle. Verification passed successfully");
        } else {
            System.out.println("actualTitle does not match with the expectedTitle.Verification failed!");



        }

    }
}
