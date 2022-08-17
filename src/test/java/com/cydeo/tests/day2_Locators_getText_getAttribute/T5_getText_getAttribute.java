package com.cydeo.tests.day2_Locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute {
    public static void main(String[] args) {


        //  TC #5: getText() and getAttribute() method practice
        //   1- Open a chrome browser

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //   2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        //   3- Verify header text is as expected:
        //  Expected: Registration form

        String expectedHeaderText = "Registration form";
        WebElement header = driver.findElement(By.tagName("h2"));
        String actualHeaderText = header.getText();
        if (expectedHeaderText.equals(actualHeaderText)) {
            System.out.println("header text verification passed");
        } else {
            System.out.println("header text verification failed");
        }

        //   4- Locate “First name” input box
        WebElement firstNameInputBox = driver.findElement(By.name("firstname"));


        //   5- Verify placeholder attribute’s value is as expected:
        //   Expected: first name
        String placeHolderAttributeValue = firstNameInputBox.getAttribute("placeholder");
        String expectedValue = "first name";
        if (placeHolderAttributeValue.equals(expectedValue)) {
            System.out.println("place holder attributes value verification passed");
        } else {
            System.out.println("place holder attributes value verification failed");
        }

    }
}
