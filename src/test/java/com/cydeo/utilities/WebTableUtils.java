package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {




    public static String returnOrderDate(WebDriver driver,String customerName){
        //Method #1 info:
        //• Name: returnOrderDate ()
        //• Return type: String
        //• Arg1: WebDriver driver
        //• Arg2: String costumerName
        //This method should accept a costumerName and return the costumer order date
        //as a String.

        WebElement costumerNameCell= driver.findElement(By.xpath("//table[@class='SampleTable']/tbody//td[.='Bob Martin']"));
        String locator= "//table[@class='SampleTable']/tbody//td[.='"+customerName+"']/following-sibling::td[3]";

        return driver.findElement(By.xpath(locator)).getText();


    }


    public static void orderVerify(WebDriver driver,String customerName,String expectedOrderDate){
        //Method #2 info:
        //• Name: orderVerify ()
        //• Return type: void
        //• Arg1: WebDriver driver
        //• Arg2: String costumerName
        //• Arg3: String expectedOrderDate
        //This method should accept above mentioned arguments and internally assert
        //expectedOrderDate matching actualOrderDate.

        String locator= "//table[@class='SampleTable']/tbody//td[.='"+customerName+"']/following-sibling::td[3]";

            String actualOrderDate= driver.findElement(By.xpath(locator)).getText();
            Assert.assertEquals(actualOrderDate,expectedOrderDate);

    }
}



/*TC #2: Web table practice Task1 cont.
 1. Create a new class called WebTableUtils.
2. Create two methods to verify order


 */