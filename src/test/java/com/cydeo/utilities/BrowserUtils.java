package com.cydeo.utilities;

public class BrowserUtils {

/*this method accepts int(in seconds) and execute Thread.sleep for given duration

 */

    public void sleep (int second){
        second*=1000;

        try {
            Thread.sleep(second);
        } catch(InterruptedException e){

            }

    }

}
