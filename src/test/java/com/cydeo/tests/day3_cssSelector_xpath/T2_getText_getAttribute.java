package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {

    public static void main(String[] args) {
        //TC #2: NextBaseCRM, locators, getText(), getAttribute() practice


        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2- Go to: https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/  ");
        //3- Verify “remember me” label text is as expected:
        //Expected: Remember me on this computer

          WebElement rememberMeLabel=  driver.findElement(By.className("login-item-checkbox-label"));
          String actualRememberMeLabel= rememberMeLabel.getText();
          String expectedRememberMeLabel= "Remember me on this computer";

          if(actualRememberMeLabel.equals(expectedRememberMeLabel)){
              System.out.println("remember me label verification passed");
          }else{
              System.out.println("remember me label verification failed");
          }
        //4- Verify “forgot password” link text is as expected:
        //Expected: Forgot your password?

          WebElement forgotYourPasswordLink=  driver.findElement(By.className("login-link-forgot-pass"));
          String actualForgotYourPasswordLinkText=forgotYourPasswordLink.getText();
          String expectedForgotYourPasswordLinkText="FORGOT YOUR PASSWORD?";

          if(expectedForgotYourPasswordLinkText.equals(actualForgotYourPasswordLinkText)){
              System.out.println("forgot your password text verification passed");
          }else{
              System.out.println("actualForgotYourPasswordLinkText = " + actualForgotYourPasswordLinkText);
              System.out.println("expectedForgotYourPasswordLinkText = " + expectedForgotYourPasswordLinkText);
              System.out.println("forgot your password text verification failed");
          }
        //5- Verify “forgot password” href attribute’s value contains expected:
        //Expected: forgot_password=yes

        String actualForgotPasswordLinkHrefAttributeValue=forgotYourPasswordLink.getAttribute("href");
        System.out.println("actualForgotPasswordLinkHrefAttributeValue = " + actualForgotPasswordLinkHrefAttributeValue);
        String expectedforgotPasswordLinkHrefAttributeValue="forgot_password=yes";
          if(actualForgotPasswordLinkHrefAttributeValue.contains(expectedforgotPasswordLinkHrefAttributeValue)){
              System.out.println("href verification passed");
          }else{
              System.out.println("href verification failed");
          }

//          driver.findElement(By.cssSelector("label[class='login-item-checkbox-label']"));
//          driver.findElement(By.cssSelector("label[for='USER_REMEMBER']"));
//          driver.findElement(By.cssSelector("label.login-item-checkbox-label"));




    }


}
