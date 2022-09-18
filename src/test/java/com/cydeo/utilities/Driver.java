package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    //we want to close access from outside the class only allow it in a way that we wanted
    //make it static because we will use it in a static method
    private static WebDriver driver;


    //creating a private constructor, so we are closing access to the object of this class from outside of class
    private Driver(){

    }

    //create a reusable utility method which will return same driver instance when we call it
    public static WebDriver getDriver(){

   if(driver==null){
//        //We read our browserType from configuration.properties this way we can control which browser is opened outside our code in .java class
//        String browserType= ConfigurationReader.getProperty("browser");
//        if(browserType.equalsIgnoreCase("chrome")){
//            WebDriverManager.chromedriver().setup();
//            driver= new ChromeDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        } else if (browserType.equalsIgnoreCase("firefox")) {
//            WebDriverManager.firefoxdriver().setup();
//            driver=new FirefoxDriver();
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//        }

       //We read our browserType from configuration.properties this way we can control which browser is opened outside our code in .java class
        String browserType=ConfigurationReader.getProperty("browser");
        switch (browserType){
            case "chrome":
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--lang=en-GB");
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case "firefox":
                WebDriverManager.chromedriver().setup();
                driver= new FirefoxDriver();
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;

        }

    }


        return driver;
    }

    //This method will make sure that our driver value is always null after using quit() method
     public static void closeDriver(){

            if(driver!=null){

                driver.quit();//this line will terminate the existing session.value will not ever be null
                driver=null;
            }

    }

}
