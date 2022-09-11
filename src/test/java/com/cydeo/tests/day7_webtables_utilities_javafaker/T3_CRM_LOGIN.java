package com.cydeo.tests.day7_webtables_utilities_javafaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_LOGIN extends TestBase {

    @Test
    public void crm_loginTest1(){

        driver.get("http://login1.nextbasecrm.com/ ");
        //Enter valid username
        WebElement userNameInput = driver.findElement(By.xpath("//input[@type='text']"));
        userNameInput.sendKeys("helpdesk1@cybertekschool.com");

        //Enter valid password
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("UserUser");
        // Click to `Log In` button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();

        //Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");

    }
    @Test
    public void crm_LoginTest_2(){

        driver.get("http://login1.nextbasecrm.com/ ");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver);

        //Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");

    }
    @Test
    public void crm_LoginTest_3(){

        driver.get("http://login1.nextbasecrm.com/ ");

        //Calling my utility method to login helpdesk1
        CRM_Utilities.crm_login(driver,"Helpdesk2@cybertekschool.com","UserUser");

        //Verify title is as expected:
        //Expected: Portal
        BrowserUtils.verifyTitle(driver,"Portal");

    }



}
/*TC #3: Login scenario
 1. Create new test and make set ups
2. Go to : http://login1.nextbasecrm.com/
3. Enter valid username
4. Enter valid password
5. Click to `Log In` button
6. Verify title is as expected:
Expected: Portal





USERNAME  PASSWORD
helpdesk1@cybertekschool.com  UserUser
Helpdesk2@cybertekschool.com  UserUser
 */