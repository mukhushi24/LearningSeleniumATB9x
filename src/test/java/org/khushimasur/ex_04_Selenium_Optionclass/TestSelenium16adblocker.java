package org.khushimasur.ex_04_Selenium_Optionclass;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium16adblocker {
    //QA Lead has given, You need to start the edge browser with the ad blocker extension installed
    //edgeOption.addextension();
    ////in youtube.com we want ad blocker
    @Description("ad blocker extension install")
    @Test
    public void test_Selenium() throws Exception{
        //there are EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
        EdgeOptions edgeOptions=new EdgeOptions();
        //edgeOptions.addArguments("--window-size=1280,720");
        edgeOptions.addArguments("--window-size=800,600");
        edgeOptions.addExtensions(new File("src/test/java/org/khushimasur/ex_04_Selenium_Optionclass/AdBlock.crx"));
        //Proxy p= new Proxy();
        //p.getHttpProxy("162.214.162.156");
        //edgeOptions.setCapability("p",p);

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");


        WebDriver driver =new EdgeDriver(edgeOptions);
        driver.get("https://youtube.com");

        //Thread.sleep(15000);
       // driver.quit();

    }

}
