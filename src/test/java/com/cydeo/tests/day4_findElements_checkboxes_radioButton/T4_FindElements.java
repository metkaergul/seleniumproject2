package com.cydeo.tests.day4_findElements_checkboxes_radioButton;

import com.cydeo.utilities.WebDriverFactory;
import com.github.dockerjava.api.model.Link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_FindElements {
    public static void main(String[] args) {

        //TC #4: FindElements Task
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //PROVIDING EXTRA TIME BEFORE IT THROWS NOSUCHELEMENTEXCEPTION
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate all the links in the page.
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));


        //4- Print out the number of the links on the page.
        System.out.println("allLinks.size() = " + allLinks.size());
        //5- Print out the texts of the links.
        int i= 1;
        for (WebElement eachLink : allLinks) {
            System.out.println("each "+i+". Link.getText() = " + eachLink.getText());
            i++;

        }
        //6- Print out the HREF attribute values of the links
        for (WebElement eachLink : allLinks) {
            System.out.println("eachLink.getAttribute(\"href\") = " + eachLink.getAttribute("href"));
        }
    }
}
