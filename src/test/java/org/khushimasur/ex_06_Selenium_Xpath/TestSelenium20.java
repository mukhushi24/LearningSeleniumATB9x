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
package org.khushimasur.ex_06_Selenium_Xpath;

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

public class TestSelenium20 {

    @Description("Verify that with valid email, pass, error message is shown on the test_katalon_login")
    @Test
    public void test_katalon_login() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");


        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        WebElement make_appointment_btn = driver.findElement(By.xpath("//a[@id='btn-make-appointment']"));
        make_appointment_btn.click();

        Thread.sleep(3000);


        // WITH THE ID
        //        WebElement username_input_box = driver.findElement(By.xpath("//input[@id='txt-username']"));
        //        username_input_box.sendKeys("John Doe");


        List<WebElement> username_input_box = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");

        WebElement login_input_box = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_input_box.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");


















        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null










    }
}
