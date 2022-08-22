package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_xpath_getText_getAttribute {
    public static void main(String[] args) {
        //TC #5: NextBaseCRM, locators, getText(), getAttribute() practice
        //1- Open a chrome browser

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");
        //3- Enter incorrect username into login box:
        WebElement loginBox = driver.findElement(By.xpath("//input[@class='login-inp']"));
        loginBox.sendKeys("incorrect");

        //4- Click to `Reset password` button
        //tagName[.='text']
        // This locator will return the web element with given text

        WebElement resetPasswordButton = driver.findElement(By.xpath("//button[.='Reset password']"));
        resetPasswordButton.click();
        //5- Verify “error” label is as expected
        //Expected: Login or E-mail not found

        WebElement errorLabel = driver.findElement(By.xpath("//div[@class='errortext']"));
        String actualErrorLabel = errorLabel.getText();
        System.out.println("actualErrorLabel = " + actualErrorLabel);

        String expectedErrorLabel = "Login or E-mail not found";

        if (actualErrorLabel.equals(expectedErrorLabel)) {
            System.out.println("error label verification passed");
        } else {
            System.out.println("error label verification failed");
        }


    }
}

//PS: Inspect and decide which locator you should be using to locate web
//elements.
//PS2: Pay attention to where to get the text   of this button from