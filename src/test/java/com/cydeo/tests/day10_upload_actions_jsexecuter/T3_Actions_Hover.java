package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers");

        WebElement img1= Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3= Driver.getDriver().findElement(By.xpath("(//img)[3]"));
        //locate all the "user" text under here
        WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2= Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3= Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        Actions action= new Actions(Driver.getDriver());
        //Hover over to first image
        BrowserUtils.sleep(2);
        action.moveToElement(img1).perform();
        Assert.assertTrue(user1.isDisplayed());

       // Hover over to second image, Assert:  “name: user2” is displayed
        BrowserUtils.sleep(2);
        action.moveToElement(img2).perform();
        Assert.assertTrue(user2.isDisplayed());

        //Hover over to third image ,Confirm: “name: user3” is displayed
        BrowserUtils.sleep(2);
        action.moveToElement(img3).perform();
        Assert.assertTrue(user3.isDisplayed());



    }
}
/*
TC #3: Hover Test
1. Go to https://practice.cydeo.com/hovers
2. Hover over to first image
3. Assert:
    a. “name: user1” is displayed

4. Hover over to second image
5. Assert:
    a. “name: user2” is displayed

6. Hover over to third image
7. Confirm:
    a. “name: user3” is displayed

*/