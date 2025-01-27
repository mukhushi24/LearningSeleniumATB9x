package org.khushimasur.ex_12_JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Scrolling {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {


        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--guest");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");

        driver=new EdgeDriver(edgeoptions);
    }
    @Test
    public void test_js(){
        driver.get("https://selectorshub.com/xpath-practice-page/");
        driver.manage().window().maximize();


        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement user=driver.findElement(By.xpath("//div[@id='userName']"));
        js.executeScript("arguments[0].scrollIntoView(true)",user);
    }
}
