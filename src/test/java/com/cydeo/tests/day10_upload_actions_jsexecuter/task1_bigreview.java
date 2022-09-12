package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class task1_bigreview {


    @Test
    public void registrationForm(){
         // 1-)Open browser
         //  getDriver() method handles driver object and with its design pattern we can use same object
         Driver.getDriver();

         //2-)Go to website: https://practice.cydeo.com/registration_form
        String url = ConfigurationReader.getProperty("env");
        Driver.getDriver().get(url);
        //first name
        WebElement firstNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        String firstNameFaker= new Faker().name().firstName();
        firstNameInput.sendKeys(firstNameFaker);
        //last name
        WebElement lastNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        String lastNameFaker= new Faker().name().lastName();
        lastNameInput.sendKeys(lastNameFaker);

        //FOR THE USER NAME I CALLED USERNAME DATA FROM THE CONFIGURATION.PROPERTIES FILE
        WebElement userNameInput = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
         String userName =ConfigurationReader.getProperty("username");
        userNameInput.sendKeys(userName);

        //FOR THE EMAIL ADDRESS I CALLED EMAIL ADDRESS DATA FROM THE CONFIGURATION.PROPERTIES FILE
        WebElement emailInput = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        String email=ConfigurationReader.getProperty("email");
        emailInput.sendKeys(email);

        //FOR THE PASSWORD I CALLED PASSWORD DATA FROM THE CONFIGURATION.PROPERTIES FILE
        WebElement passwordInput = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        String password=ConfigurationReader.getProperty("password");
        passwordInput.sendKeys(password);

        //FOR THE PHONE NUMBER I APPLIED JAVAFAKER FOR CREATING RANDOM TEST DATA
        WebElement phoneInput = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        String phoneFaker= new Faker().numerify("534-###-####");
        phoneInput.sendKeys(phoneFaker);

       // Select a gender from radio buttons
        WebElement genderMaleButton = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        genderMaleButton.click();

        //FOR THE DATE OF BIRTH I CALLED BIRTH DATA FROM THE CONFIGURATION.PROPERTIES FILE
        WebElement dateOfBirthPlaceholder = Driver.getDriver().findElement(By.xpath("//input[@placeholder='MM/DD/YYYY']"));
        String dateOfBirth=ConfigurationReader.getProperty("dateOfBirth");
        dateOfBirthPlaceholder.sendKeys(dateOfBirth);

        // Select Department/Office
        WebElement departmentDropdown = Driver.getDriver().findElement(By.xpath("//select[@name='department']"));
        Select department=new Select(departmentDropdown);
        department.selectByVisibleText("Department of Engineering");

        //Select Job Title
        WebElement jobTitleDropdown = Driver.getDriver().findElement(By.xpath("//select[@name='job_title']"));
        Select jobtitle=new Select(jobTitleDropdown);
        jobtitle.selectByIndex(4);

        // Select programming language from checkboxes
        //I wanted to select all checkboxes available
        List<WebElement> AllLanguageCheckBoxes = Driver.getDriver().findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement each:AllLanguageCheckBoxes){

            each.click();
        }

        //Click to sign up button
        WebElement signUpButton = Driver.getDriver().findElement(By.xpath("//button[.='Sign up']"));
        signUpButton.click();

        // Verify success message “You’ve successfully completed registration.” is displayed.
        WebElement successMessage = Driver.getDriver().findElement(By.xpath("//h4[.='Well done!']/following-sibling::p"));
        Assert.assertTrue(successMessage.isDisplayed());





    }


}
/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.
1. Open browser
2. Go to website: https://practice.cydeo.com/registration_form
3. Enter first name
4. Enter last name
5. Enter username
6. Enter email address
7. Enter password
8. Enter phone number
9. Select a gender from radio buttons
10. Enter date of birth
11. Select Department/Office
12. Select Job Title
13. Select programming language from checkboxes
14. Click to sign up button
15. Verify success message “You’ve successfully completed registration.” is
displayed.


Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense*/