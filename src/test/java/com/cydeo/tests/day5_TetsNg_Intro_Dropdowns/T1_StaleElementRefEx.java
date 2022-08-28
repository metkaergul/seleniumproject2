package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {

    public static void main(String[] args) throws InterruptedException {

        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #1: StaleElementReferenceException handling

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/add_remove_elements/
        driver.get(" https://practice.cydeo.com/add_remove_elements/ ");
        //3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(2000);
        addElementButton.click();
        //4. Verify “Delete” button is displayed after clicking.
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("after clicking add element button deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        //5. Click to “Delete” button.
        deleteButton.click();
        //6. Verify “Delete” button is NOT displayed after clicking.
        //after clicking delete button it will be erased from the html page then we can not relocate the delete element
        //so we have to use try catch to handle StaleElementReference exception


        try {
            System.out.println("after clicking delete button deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReference Exception is thrown");
            System.out.println("it means the web elements is completely deleted from the page");
            System.out.println("after clicking delete button deleteButton.isDisplayed() = false");

        }
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
        driver.close();

    }


}

