package org.khushimasur.ex_03_Selenium;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium05 {
    @Description("Open the App.vwo.com and get the tittle")
    @Test
    public void test_Selenium(){
        WebDriver driver = new FirefoxDriver();//97% used
        driver.get("http://app.vwo.com");


    }
}
