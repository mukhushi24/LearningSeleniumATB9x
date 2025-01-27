//package org.khushimasur.ex_05_Selenium_Locators;
//
//import io.qameta.allure.Description;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeOptions;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.io.File;
//
//public class TestSelenium17__miniproject {
//
//    @Description("verify that  invalid email id and password show error message on the app.vwo.com")
//    @Test
//    public void test_negative_vwo_login() throws Exception{
//        //there are EdgeOptions, ChromeOptions, FirefoxOptions, SafariOptions
//        EdgeOptions edgeOptions=new EdgeOptions();
//        //edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,600");
//
//        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//
//
//        WebDriver driver =new EdgeDriver(edgeOptions);
//        //driver.navigate().to("https://google.com");
//        driver.get("https://app.vwo.com");
//        //1.Find the email inputbox and enter the mail
//        //<input type="email"
//        // class="text-input W(100%)"
//        // name="username"
//        // id="login-username"
//        // data-qa="hocewoqisi">
//        WebElement emailInputBox= driver.findElement(By.id("login-username"));
//        emailInputBox.sendKeys("admin@admin.com");
//
//        //2.find the password input box and enter the password
//        //<input type="password"
//        // class="text-input W(100%)"
//        // name="password"
//        // id="login-password"
//        // data-qa="jobodapuxe">
//        WebElement passwordInputBox=driver.findElement(By.name("password"));
//        passwordInputBox.sendKeys("admin");
//        //3.find the submit box and click on it
//        //<button type="submit"
//        // id="js-login-btn"
//        // class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)" onclick="login.login(event)" data-qa="sibequkica">
//        //									<span class="icon loader hidden" data-qa="zuyezasugu"></span>
//        //									<span data-qa="ezazsuguuy">Sign in</span>
//        //								</button>
//        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
//        buttonSubmit.click();
//        //4.find the invalid error message and verify.
//        //<div class="notification-box-description"
//        // id="js-notification-box-msg" data-qa="rixawilomi">Your email, password, IP address or location did not match</div>
//        WebElement error_message = driver.findElement(By.className("notification-box-description"));
//
//        Assert.assertEquals(error_message.getText(),"Your email, password, IP address or location did not match");
//
//        //Thread.sleep(15000);
//       // driver.quit();
//
//    }
//
//}
package org.khushimasur.ex_05_Selenium_Locators;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17__miniproject {

    @Description("verify that invalid email id and password show error message on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {
        // EdgeOptions setup
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=800,600");

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");
        //References help save memory because you don’t need to create multiple copies of large objects.
        //This line uses Selenium WebDriver to find an HTML element by its ID attribute ("js-login-btn").
        // It stores the reference to this button in the variable buttonSubmit.



        // Find the email input box and enter the email
        WebElement emailInputBox = driver.findElement(By.id("login-username"));
        emailInputBox.sendKeys("admin@admin.com");

        // Find the password input box and enter the password
        WebElement passwordInputBox = driver.findElement(By.name("password"));
        passwordInputBox.sendKeys("admin");

        // Find the submit button and click on it
        WebElement buttonSubmit = driver.findElement(By.id("js-login-btn"));
        buttonSubmit.click();

        // <div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.25s) Op(0) invalid-input+Op(1) invalid-reason">
        // The email address you entered is incorrect.
        // </div>

        //<div
        // class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1)
        // invalid-reason">The email address you entered is incorrect.</div>

        WebElement error_message = driver.findElement(By.className("invalid-reason"));

        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");

    }
}
