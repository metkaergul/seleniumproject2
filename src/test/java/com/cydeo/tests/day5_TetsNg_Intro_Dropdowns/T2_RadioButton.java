package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) {

        //XPATH PRACTICES
        //DO NOT USE ANY DEVELOPER TOOLS TO GET ANY LOCATORS.
        //TC #2: Radiobutton handling
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to https://practice.cydeo.com/radio_buttons
        driver.get("https://practice.cydeo.com/radio_buttons ");
        //3. Click to “Hockey” radio button
        WebElement hockeyButton = driver.findElement(By.xpath("//input[@id='hockey']"));
        hockeyButton.click();


        //4. Verify “Hockey” radio button is selected after clicking.

        System.out.println("after clicking hockey button ,hockeyButton.isSelected() = " + hockeyButton.isSelected());
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
driver.close();
    }
}
