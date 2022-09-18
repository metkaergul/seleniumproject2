package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_Drop {

@Test
    public void drag_drop_test(){

    //  driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

    Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

    //locate acceptCookiesButton and click
    WebElement acceptCookiesButton=Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
    acceptCookiesButton.click();

    //drag and drop the small circle to bigger circle
    WebElement smallCircle = Driver.getDriver().findElement(By.xpath("//div[@id='draggable']"));
    WebElement bigCircle = Driver.getDriver().findElement(By.xpath("//div[@id='droptarget']"));

    Actions action =new Actions(Driver.getDriver());

//    action.dragAndDrop(smallCircle,bigCircle).perform();

    action.clickAndHold(smallCircle).pause(2000).moveToElement(bigCircle).release().perform();
    //assert Text in big circle changed to : "You did great!"

    String actualBigCircleText= bigCircle.getText();
    String expectedBigCircleText="You did great!";
    Assert.assertEquals(actualBigCircleText,expectedBigCircleText);




}
}
