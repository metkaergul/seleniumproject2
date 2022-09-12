package com.cydeo.tests.day10_upload_actions_jsexecuter;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        //Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));

       // Find some small file from your computer, and get the path of it.
        String path= "/Users/etkaergul/Desktop/handleupload/Screen Shot 2022-09-10 at 21.00.56.png";
        chooseFile.sendKeys(path);

       //Upload the file.
        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//input[@value='Upload']"));

        uploadButton.click();

        //Assert:
        //-File uploaded text is displayed on the page
        WebElement uploadMessageHeader = Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(uploadMessageHeader.isDisplayed());


    }



}
/*TC #2 Upload Test
1. Go to https://practice.cydeo.com/upload
2. Find some small file from your computer, and get the path of it.
3. Upload the file.
4. Assert:
-File uploaded text is displayed on the page */