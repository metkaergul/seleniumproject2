package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_3 {
    public static void main(String[] args) {


        //TC #3: Back and forth navigation

        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2- Go to: https://google.com
        driver.get("https://google.com ");

        // 3- Click to Gmail from top right.
        WebElement gmailLink = driver.findElement(By.linkText("Gmail"));
        gmailLink.click();


        //  4- Verify title contains:
        //  Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("title verification passed");
        } else {
            System.out.println("title verification failed");
        }

        //  5- Go back to Google by using the .back();
        driver.navigate().back();


        //  6- Verify title equals:
        //   Expected: Google
        String expectedTitle = "Google";
        String actualCurrentTitle = driver.getTitle();

        if (actualCurrentTitle.equals(expectedTitle)) {
            System.out.println("title verification passed");
        } else {
            System.out.println("title verification failed");
        }

    }
}
