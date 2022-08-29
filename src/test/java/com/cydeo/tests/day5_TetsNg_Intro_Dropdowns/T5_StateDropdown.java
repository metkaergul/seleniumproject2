package com.cydeo.tests.day5_TetsNg_Intro_Dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_StateDropdown {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to https://practice.cydeo.com/dropdown
        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void StateDropdown() throws InterruptedException {

        //TC #5: Selecting state from State dropdown and verifying result

        //3. Select Illinois
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");
        Thread.sleep(2000);
        //4. Select Virginia
        stateDropdown.selectByValue("VA");
        Thread.sleep(2000);
        //5. Select California
        stateDropdown.selectByIndex(5);
        Thread.sleep(2000);
        //6. Verify final selected option is California.
        String currentSelectedStateText = stateDropdown.getFirstSelectedOption().getText();//it gets the current selected option
        Assert.assertEquals(currentSelectedStateText, "California");
        //Use all Select options. (visible text, value, index)


    }


}
