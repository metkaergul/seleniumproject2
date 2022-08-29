package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T7_nonSelectDropdown {

    //TC #7: Selecting value from non-select dropdown
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void nonSelectDropdown() {
        //3. Click to non-select dropdown
        WebElement nonSelectedDropdownLink = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        nonSelectedDropdownLink.click();


        //4. Select Facebook from dropdown
        WebElement facebookButton = driver.findElement(By.xpath("//a[.='Facebook']"));
        facebookButton.click();
        //5. Verify title is “Facebook - Log In or Sign Up”
        Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up", "expected title and actual title does not match");

    }

    @AfterMethod
    public void afterMethod() {

        driver.close();
    }


}
