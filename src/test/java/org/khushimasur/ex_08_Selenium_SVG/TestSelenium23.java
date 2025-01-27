package org.khushimasur.ex_08_Selenium_SVG;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium23 {
    @Test(groups = "QA")
    @Description("Test Case Description")
    public void test_web_table_login() throws Exception {

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");


        WebDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();


        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("macmini");//.sendKeys("macmini");

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'macmini')]"))); suggestion.click();
        List<WebElement> svgElements = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgElements.get(0).click();
        Thread.sleep(5000);
        driver.quit();
    }
}