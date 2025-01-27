package org.khushimasur.ex_09_ActionClass;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
//close the modal by clicking on "X" and send keys delhi

public class TestSelenium27_makemytrip {
    EdgeDriver driver;
    @BeforeTest
@Description("Test Case Description")
public void before_test() {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver(edgeOptions);
    }
        @Test
        @Description("test")
        public void test_actions() throws InterruptedException {
            String URL = "https://www.makemytrip.com/";
            driver.get(URL);
            driver.manage().window().maximize();

            // Wait for the popup to come and click the x icon
            //span[@data-cy='closeModal']

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait
                    .until(
                            ExpectedConditions.
                                    visibilityOfElementLocated(
                                            By.xpath("//span[@data-cy='closeModal']"
                                            )
                                    )
                    );


            driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();

            WebElement fromCity = driver.findElement(By.id("fromCity"));

            Actions actions = new Actions(driver);
            actions.moveToElement(fromCity).click().sendKeys("del").build().perform();

            Thread.sleep(3000);

            actions.moveToElement(fromCity).keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).perform();

            //        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));
//
//        for(WebElement e : list_auto_complete){
//            if(e.getText().contains("New Delhi")){
//                e.click();
//                break;
//            }
//        }


        }


    @AfterTest
    @Description("Test Case Description")

    public void closeBrowser() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }


}
