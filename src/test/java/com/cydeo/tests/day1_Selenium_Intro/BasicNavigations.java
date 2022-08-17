package com.cydeo.tests.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2-Create instance of the Selenium web driver
        WebDriver driver=new ChromeDriver();

        //This method will maximize the browser size
        driver.manage().window().maximize();

        //3-Go to https://Tesla.com
        driver.get("https://www.Tesla.com");

        //get the title of the page and print right away
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get the current url of the page and print right away
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        // stop code execution for three seconds
        Thread.sleep(3000);

        // Use selenium to navigate back
        driver.navigate().back();

        // stop code execution for three seconds
        Thread.sleep(3000);

        // Use selenium to navigate forward
        driver.navigate().forward();

        // stop code execution for three seconds
        Thread.sleep(3000);

        //  Use selenium to navigate refresh
        driver.navigate().refresh();

        // stop code execution for three seconds
        Thread.sleep(3000);

        //use navigate().to();
        driver.navigate().to("https://www.google.com");

        //get the current title after getting the Google page and print it right away
        currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get the current URL with the get.currentUrl() method and print right away
        currentUrl=driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //it close only the currently opened browser
        driver.close();

        //it kills the current session,if more than one window was opened,everything will be closed
        driver.quit();





    }
}
