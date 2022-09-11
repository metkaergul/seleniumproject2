package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class T4_Config_Practice {

   public  WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        //1. Open browser
        WebDriverManager.chromedriver().setup();

        String browser= ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to:www.google.com
        String url=  ConfigurationReader.getProperty("env");
        driver.get(url);


    }


    @Test
    public void google_search_test(){

        WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));

        String searchValue= ConfigurationReader.getProperty("search");
        searchBox.sendKeys(searchValue+ Keys.ENTER);
        //we can make our expected title also dynamic which make our assertion always precise even if we change the data in properties file
        String expectedTitle=searchValue+" - Google'da Ara";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


    }

}
/*
TC #4: Google search
1- Open a chrome browser
2- Go to: https://google.com
3- Write “apple” in search box
4- Verify title:
Expected: apple - Google Search


Use `configuration.properties` for the following:
1. The browser type
2. The URL
3. The search keyword
4. Make title verification dynamic. If search value changes, title
assertion should not fail.  */