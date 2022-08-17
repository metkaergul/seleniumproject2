package com.cydeo.tests.day2_Locators_getText_getAttribute;

import com.google.common.base.Verify;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_1 {
    public static void main(String[] args) {


        //  TC #1: Etsy Title Verification
        //  1. Open Chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //  2. Go to https://www.etsy.com
        driver.get(" https://www.etsy.com");

        //  3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);


        //  4. Verify title:
        //  Expected: “Wooden spoon | Etsy”

        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("title verification passed");
        } else {
            System.out.println("title verification failed");
        }


    }
}
