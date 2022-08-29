package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ServiceLoader;
import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {


     WebDriver driver;

    @BeforeMethod

    public void setUpMethod(){
        WebDriverManager.chromedriver().setup();
         driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Open Chrome browser

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");
    }
    @Test
    public void simpleDropdownTest(){


        //TC#4: Verifying “Simple dropdown” and “State selection” dropdown default values


        //3. Verify “Simple dropdown” default selected value is correct
        //Expected: “Please select an option”
        Select simpleDropdown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();
        String actualDefaultSimpleDropdownText=  currentlySelectedOption .getText();
        String expectedDefaultSimpleDropdownText="Please select an option";

        Assert.assertEquals(actualDefaultSimpleDropdownText,expectedDefaultSimpleDropdownText);


        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State” */
        Select stateDropdown= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        WebElement currentStateDropdownSelectedOption = stateDropdown.getFirstSelectedOption();
        String actualStateDropdownSelectedOptionText = currentStateDropdownSelectedOption.getText();
        String expectedStateDropdownSelectedOptionText="Select a State";
        Assert.assertEquals(actualStateDropdownSelectedOptionText,expectedStateDropdownSelectedOptionText);


    }


}
/*
TC#4: Verifying “Simple dropdown” and “State selection” dropdown
default values
1. Open Chrome browser
2. Go to https://practice.cydeo.com/dropdown
3. Verify “Simple dropdown” default selected value is correct
Expected: “Please select an option”
4. Verify “State selection” default selected value is correct
Expected: “Select a State” */