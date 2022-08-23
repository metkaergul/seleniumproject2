package com.cydeo.tests.day4_findElements_checkboxes_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class T1_xpath_csselectorPractice {
    public static void main(String[] args) {

        //TC #1: XPATH and cssSelector Practices
        //1. Open Chrome browser

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");
        //3. Locate all the WebElements on the page using XPATH and/or CSS
        //locator only (total of 6)
        //a. “Home” link
        driver.findElement(By.cssSelector("a[class='nav-link']"));
        driver.findElement(By.cssSelector("a[href=\"/\"]"));


        //b. “Forgot password” header
        //c. “E-mail” text
        //d. E-mail input box
        //e. “Retrieve password” button
        //f. “Powered by Cydeo text
        //4. Verify all web elements are displayed.

    }





}
//First solve the task with using cssSelector only. Try to create 2 different
//cssSelector if possible

//Then solve the task using XPATH only. Try to create 2 different
//XPATH locator if possible
