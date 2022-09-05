package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.GetTable_GetEmail_utils;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class emailBasedOnNameFromTable {

public WebDriver driver;
@BeforeMethod
public void setUpMethod(){

    driver=WebDriverFactory.getDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}


    @Test
    public void emailTest(){
        //1- Open a chrome browser
        driver.get("https://practice.cydeo.com/tables");
        //2- Go to: https://practice.cydeo.com/tables

        //we called the gettablegetemail util method from the  GetTable_GetEmail_utils class to be able to locate
        //customer email based on his/her name
        GetTable_GetEmail_utils.getTableGetEmail(driver,"table1","John");

    }
}
