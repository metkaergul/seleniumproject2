package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {


    //this method accepts int(in seconds) and execute Thread.sleep for given duration
    public static void sleep(int second) {
        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {

        }

    }


 //------------------------------------------------------


    //when following method is called   it should switch window and verify title.
    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedInTitle) {
/*TC #2: Create utility method
 1. Create a new class called BrowserUtils
2. Create a method to make Task1 logic re-usable
3. When method is called, it should switch window and verify title.


Method info:
• Name: switchWindowAndVerify
• Return type: void
• Arg1: WebDriver
• Arg2: String expectedInUrl
• Arg3: String expectedInTitle
 */

        WebDriverManager.chromedriver().setup();

        for (String eachWindow : driver.getWindowHandles()) {
            driver.switchTo().window(eachWindow);

            if (driver.getCurrentUrl().contains(expectedInUrl)) {
                break;
            }

        }

        String actualCurrentTitle = driver.getTitle();
        Assert.assertTrue(actualCurrentTitle.contains(expectedInTitle));

    }


}
