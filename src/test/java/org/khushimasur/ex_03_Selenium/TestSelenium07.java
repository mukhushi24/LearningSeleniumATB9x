package org.khushimasur.ex_03_Selenium;


import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium07 {
    @Description("Open the url")
    @Test
    public void test_Selenium(){
        // Set the system property for EdgeDriver
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.getTitle();
        driver.getCurrentUrl();
        driver.getPageSource();
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.quit();




    }
}
