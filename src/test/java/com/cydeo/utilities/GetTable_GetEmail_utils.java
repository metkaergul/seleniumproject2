package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetTable_GetEmail_utils {

    public static void getTableGetEmail(WebDriver driver ,String tableNum ,String firstName){

      WebElement getEmail=  driver.findElement(By.xpath("//table[@id='"+tableNum+"']/tbody//td[.='"+firstName+"']/following-sibling::td[1]"));
        System.out.println(getEmail.getText());
    }


}
/*TC #3: Create a custom method

3- Write custom method:

• Method name: getTableGetEmail()
• Return type: void
• Arg1: WebDriver driver
• Arg2: String tableNum
• Arg3: String firstName */