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
//import java.util.List;
//
//public class TestSelenium19__miniproject3 {
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
//
//
//        WebElement a_tag_free_trail=driver.findElement(By.linkText("Start a free trial"));
//         a_tag_free_trail.click();
//
//        //<input class="W(100%) Py(14px) input-text" placeholder="name@yourcompany.com"
//        // type="email"
//        // id="page-v1-step1-email"
//        // name="email"
//        // data-qa="page-su-step1-v1-email" required="">
//
//
//
//        WebElement Business_Email=driver.findElement(By.id("page-v1-step1-email"));
//        Business_Email.sendKeys("Kushi");
//        //<input class="W(100%) Py(14px) input-text" placeholder="name@yourcompany.com"
//        // type="email" id="page-v1-step1-email"
//        // name="email"
//        // data-qa="page-su-step1-v1-email" required="">
//
//        WebElement terms=driver.findElement(By.name("gdpr_consent_checkbox"));
//        terms.click();
//
//        //<button type="submit"
//        // disabled="" class="button button--disabled-primary W(100%) btn-modal-form-submit"
//        // data-qa="page-su-submit">Create a Free Trial Account</button>
//
//
//        //WebElement submit=driver.findElement    "s"   (By.tagName("button"));
//        //in list of 64 buttons we want first one so get(0)
//
//        List<WebElement> buttonList=driver.findElements(By.tagName("button"));
//        buttonList.get(0).click();
//
//        //<div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">The email address you entered is incorrect.
//
//
//        WebElement error_message = driver.findElement(By.className("invalid-reason"));
//
//        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");
//
//
//
//
//
//
//        Thread.sleep(5000);
//        driver.quit();
//
//
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium19__miniproject3 {

    @Description("verify that invalid email id and password show error message on the app.vwo.com")
    @Test
    public void test_negative_vwo_login() throws Exception {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=800,600");

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver(edgeOptions);

        driver.get("https://app.vwo.com");

        WebElement a_tag_free_trial = driver.findElement(By.linkText("Start a free trial"));
        a_tag_free_trial.click();

        WebElement business_Email = driver.findElement(By.id("page-v1-step1-email"));
        business_Email.sendKeys("Kushi");

        WebElement terms = driver.findElement(By.name("gdpr_consent_checkbox"));
        terms.click();

        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        WebElement error_message = driver.findElement(By.className("invalid-reason"));

        // Wait for the error message to be visible and verify it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("notification-box-description")));


        Assert.assertEquals(error_message.getText(), "The email address you entered is incorrect.");

        Thread.sleep(5000);
        driver.quit();
    }
    ////button[id="btn-login"]
}
