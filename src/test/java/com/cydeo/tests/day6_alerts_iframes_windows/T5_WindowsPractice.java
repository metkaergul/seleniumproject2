package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowsPractice {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open browser
        WebDriverManager.chromedriver().setup();
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //3. Go to : https://practice.cydeo.com/windows
        driver.get("https://practice.cydeo.com/windows ");
    }
    @Test
    public void multiple_Window_Test(){
        //4. Assert: Title is “Windows”
        String actualTitle= driver.getTitle();
        String expectedTitle= "Windows";
        Assert.assertEquals(actualTitle,expectedTitle);

        System.out.println("page title before clicking to \'çlick here\'link = " + driver.getTitle());

        //5. Click to: “Click Here” link
        WebElement clickHereLink = driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHereLink.click();

        System.out.println("page title after clicking to \'çlick here\'link = " + driver.getTitle());


        //6. Switch to new Window.
        for (String each: driver.getWindowHandles()){

            driver.switchTo().window(each);
            System.out.println("current title while switching windows = " + driver.getTitle());
        }
        //7. Assert: Title is “New Window”  */

        String expectedTitleAfterClick= "New Window";
        String actualTitleAfterClick= driver.getTitle();
        Assert.assertEquals(expectedTitleAfterClick,actualTitleAfterClick);
        System.out.println("TitleAfterClick = " + actualTitleAfterClick);

    }
    @AfterMethod
    public void tearDown(){
        //since we have two windows opened in this tasks after method only close the last opened window
        driver.close();
    }

}
/*TC #5: Window Handle practice

1. Create a new class called: T5_WindowsPractice
2. Create new test and make set ups
3. Go to : https://practice.cydeo.com/windows
4. Assert: Title is “Windows”
5. Click to: “Click Here” link
6. Switch to new Window.
7. Assert: Title is “New Window”  */