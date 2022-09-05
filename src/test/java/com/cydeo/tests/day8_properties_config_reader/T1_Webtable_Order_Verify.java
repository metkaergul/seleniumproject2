package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Webtable_Order_Verify {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){

        WebDriverManager.chromedriver().setup();
        driver  = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/web-tables ");
    }

    @Test
    public void orderName_verify_test(){

        //TC #1: Web table practice
        // 1. Go to: https://practice.cydeo.com/web-tables
        //2. Verify Bob’s name is listed as expected.
        //Expected: “Bob Martin”
        //3. Verify Bob Martin’s order date is as expected
        //Expected: 12/


        WebElement bobMartinCell= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody//td[.='Bob Martin']"));
            String expectedName= "Bob Martin";
            String actualName= bobMartinCell.getText();
        Assert.assertEquals(expectedName,actualName);

        System.out.println("_____________________________");
        WebElement bobSOrderDate= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody//td[.='Bob Martin']/following-sibling::td[3]"));
       String expectedOrderDate= "12/31/2021";
       String actualOrderDate= bobSOrderDate.getText();
       Assert.assertEquals(expectedOrderDate,actualOrderDate);

    }

    //we use the utility method ( returnOrderDate() ) that we created
    @Test
    public void test2(){
        String orderDate1= WebTableUtils.returnOrderDate(driver,"Bob Martin");
        String orderDate2= WebTableUtils.returnOrderDate(driver,"John Doe");

        System.out.println("orderDate1 = " + orderDate1);
        System.out.println("orderDate2 = " + orderDate2);
    }

    //we use utility method (verifyOrder() )that we created inside the webtableutils class
    @Test
    public void test3(){

        WebTableUtils.orderVerify(driver,"Alexandra Gray","04/15/2021");

    }


}
