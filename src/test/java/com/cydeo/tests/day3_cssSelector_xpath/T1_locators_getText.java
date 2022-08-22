package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {


        //       TC #1: NextBaseCRM, locators and getText() practice


        //        1- Open a chrome browser
                  WebDriverManager.chromedriver().setup();
                  WebDriver driver=new ChromeDriver();
                  driver.manage().window().maximize();
        //        2- Go to: https://login1.nextbasecrm.com/
                   driver.get("https://login1.nextbasecrm.com/ ");
        //        3- Enter incorrect username: “incorrect”
                   WebElement userNameInputBox=  driver.findElement(By.name("USER_LOGIN"));
                   userNameInputBox.sendKeys("incorrect");

        //        4- Enter incorrect password: “incorrect”
                   WebElement passwordInputBox=  driver.findElement(By.name("USER_PASSWORD"));
                    passwordInputBox.sendKeys("incorrect");

        //        5- Click to login button.
                   WebElement loginButton=  driver.findElement(By.className("login-btn"));
                   loginButton.click();
        //        6- Verify error message text is as expected:
        //        Expected: Incorrect login or password

                   WebElement errorText=  driver.findElement(By.className("errortext"));
                   String actualErrorText= errorText.getText();
                   String expectedErrorText= "Incorrect login or password";

                   if(actualErrorText.equals(expectedErrorText)){
                       System.out.println("errortext verification passed");
                   }else{
                       System.out.println("error text verification failed");
                   }




    }
}
