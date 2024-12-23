package org.khushimasur.ex01_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {
    @Test
    public void testSelenium01(){
        //open the URL
        //Print the tittle
        FirefoxDriver driver= new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

        //create a instance of firefox class
        //.get function
    }

}
