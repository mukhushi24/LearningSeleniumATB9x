package org.khushimasur.ex_03_Selenium;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {
    // Selenium 3
    // You need to setup the Driver(browser)
    //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

    // Selenium 4
    // Selenium Manager - utility - Which can download the driver automaticially
    // start and stop itself.
    @Test
    public void test_Selenium(){
        EdgeDriver driver=new EdgeDriver();
        driver.get("http://google.com");
    }
}
