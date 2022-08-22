package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {


       // TASK: NEW METHOD CREATION
       // Method Name: getDriver
       // Static method
       //Accept String arg: browserType
       //  -This arg will determine what type of browser  opened
       //  -if "chrome"  passed -->it will open chrome browser
        // -if "firefox" passed  -->it will open firefox browser
        //Return type : WebDriver

        public static WebDriver getDriver(String browserType){



                if(browserType.equals("chrome")){
                    WebDriverManager.chromedriver().setup();

                    return  new ChromeDriver();

                }else if(browserType.equals("firefox")){
                    WebDriverManager.firefoxdriver().setup();

                   return  new FirefoxDriver();
                }else{
                    System.out.println("Given browser type does not exist/or is not currently supported");
                    System.out.println("Driver=null");
                    return null;
                }

        }
}
