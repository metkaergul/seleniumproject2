package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkTextPractice {
    public static void main(String[] args) {

        // TC #2: Back and forth navigation
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        // 3- Click to A/B Testing from top of the list.
        //first we need to locate the link with the find element method through the linkText method
        //then for the sake of readabilty and more clean code we assigned this specific link into a variable

        WebElement abTestLink = driver.findElement(By.linkText("A/B Testing"));
        abTestLink.click();

        // 4- Verify title is:
        // Expected: No A/B Test

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("title verification passed");
        } else {
            System.out.println("Title verification failed");
        }

        // 5- Go back to home page by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:
        // Expected: Practice
        expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification passed");
        } else {
            System.out.println("Title verification failes");
        }


    }
}
