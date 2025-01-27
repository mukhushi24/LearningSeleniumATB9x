package org.khushimasur.ex_05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium18__miniproject2 {

    @Description("verify that  invalid email id and password show error message on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception{
        //there are EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
        EdgeOptions edgeOptions=new EdgeOptions();
        //edgeOptions.addArguments("--window-size=1280,720");
        edgeOptions.addArguments("--window-size=800,600");

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");


        WebDriver driver =new EdgeDriver(edgeOptions);
        //driver.navigate().to("https://google.com");
        driver.get("https://app.vwo.com");

       // WebElement a_tag_free_trail=driver.findElement(By.linkText("Start a free trial"));
       // a_tag_free_trail.click();

        WebElement a_tag_free_trail=driver.findElement(By.partialLinkText("Start a free trial"));
        a_tag_free_trail.click();


        Thread.sleep(5000);
        driver.quit();



    }

}
