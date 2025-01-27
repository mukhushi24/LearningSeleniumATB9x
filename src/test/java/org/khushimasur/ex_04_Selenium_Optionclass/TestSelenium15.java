package org.khushimasur.ex_04_Selenium_Optionclass;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium15 {
    //ad-blocker
    //add argument before staring chrome
    //Headless mode-no UI behind the scene everything works
    //maximise
    //set the path of chrome,edge,window size
    //Incognito mode
    @Description("option class")
    @Test
    public void test_Selenium() throws Exception{
        //there are EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
        EdgeOptions edgeOptions=new EdgeOptions();
        //edgeOptions.addArguments("--window-size=1280,720");
        edgeOptions.addArguments("--window-size=800,600");
        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?

//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,600");
//        edgeOptions.addArguments("--incognito");
        // edgeOptions.addArguments("--start-maximized");
        edgeOptions.addArguments("--headless");



        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");


        WebDriver driver =new EdgeDriver(edgeOptions);
        driver.get("https://google.com");

        Thread.sleep(15000);
        driver.quit();
        //Thread.sleep(15000); is like telling your code to take a 15-second nap. During this time, your program pauses and doesn’t do anything.
        //
        //However, sometimes your program might get woken up unexpectedly during this nap, like if someone shakes you while you’re sleeping.
        // This unexpected wake-up is called an InterruptedException
    }

}
