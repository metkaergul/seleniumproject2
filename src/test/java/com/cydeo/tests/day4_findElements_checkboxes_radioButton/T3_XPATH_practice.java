package com.cydeo.tests.day4_findElements_checkboxes_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_XPATH_practice {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //2. Go to http://practice.cydeo.com/multiple_buttons
        driver.get("http://practice.cydeo.com/multiple_buttons ");
        //3. Click on Button 1
        WebElement Button1= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        Button1.click();
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        WebElement textAfterButton1Clicked=driver.findElement(By.xpath("//p[@id='result']"));
        String actualTextAfterClickingButton1=textAfterButton1Clicked.getText();
        String expectedText="Clicked on button one!";

        if(actualTextAfterClickingButton1.equals(expectedText)){
            System.out.println("text display verification passed");
        }else{
            System.out.println("text display verification failed");
        }


    }
}
//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS