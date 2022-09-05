package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

//This method will log-in with helpdesk1@cybertekschool.com
// user when it is called
    public static void crm_login(WebDriver driver){

        //Enter valid username
        WebElement userNameInput = driver.findElement(By.xpath("//input[@type='text']"));
        userNameInput.sendKeys("helpdesk1@cybertekschool.com");

        //Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("UserUser");
        // Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

    }
    public static void crm_login(WebDriver driver,String username,String password){

        //Enter valid username
        WebElement userNameInput = driver.findElement(By.xpath("//input[@type='text']"));
        userNameInput.sendKeys(username);

        //Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys(password);
        // Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

    }
}
