package org.khushimasur.ex_03_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium11 {
    @Test
    public void test_Selenium(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");//95% times used
        //use navigate method
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();
        // Close - will close the current tab, not the session that is it will close google not bing
        // session id != null

//        Thread.sleep(3000);
//        driver.close();
       // Thread.sleep(3000);
//        driver.close();it will close all the tabs
        
    }
}
