package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_dateDropdown {

    //TC #6: Selecting date on dropdown and verifying
    WebDriver driver;//this is a field that allow methods to use it within

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
    public void dateDropdown() {
        //3. Select “December 1st, 1923” and verify it is selected.


        //Select year using  : visible text
        Select dateDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        dateDropdown.selectByVisibleText("1923");
        Assert.assertEquals(dateDropdown.getFirstSelectedOption().getText(), "1923");


        //Select month using value attribute
        dateDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        dateDropdown.selectByValue("11");
        Assert.assertEquals(dateDropdown.getFirstSelectedOption().getText(), "December");

        //Select day using : index number
        dateDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dateDropdown.selectByIndex(0);
        Assert.assertEquals(dateDropdown.getFirstSelectedOption().getText(), "1");


    }
}
