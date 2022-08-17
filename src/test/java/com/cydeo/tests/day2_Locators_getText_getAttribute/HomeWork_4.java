package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork_4 {
    public static void main(String[] args) {

       // TC #4: Practice Cydeo – Class locator practice
       // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        // 2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

       // 3- Click to “Home” link
        WebElement homeLink=driver.findElement(By.className("nav-link"));
        homeLink.click();
       // 4- Verify title is as expected:
       // Expected: Practice

        String expectedTitle= "Practice";
        String actualTitle= driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("title verification passed");
        }else{
            System.out.println("title verification failed");
        }



    }
}
// PS: Locate “Home” link using “className” locator