package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task_4_and_5_practices() {


        // TC #4: Scroll practice
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/

        Driver.getDriver().get("https://practice.cydeo.com/");


        //3- Scroll down to “Powered by CYDEO”
        //create object of Actions and pass our "driver" instance
        Actions action = new Actions(Driver.getDriver());

        //4- Scroll using Actions class “moveTo(element)” method
        WebElement cydeoLink = Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));

        action.moveToElement(cydeoLink).pause(2000).perform();


//        2- Scroll back up to “Home” link using PageUP button
        action.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();


    }

    @Test
    public void test2() {
        Driver.getDriver().get("https://practice.cydeo.com/");
    Driver.closeDriver();
    }

    @Test
    public void test3() {
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test4() {
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }
}