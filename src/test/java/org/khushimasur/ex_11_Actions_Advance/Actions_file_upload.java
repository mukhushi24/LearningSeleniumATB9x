package org.khushimasur.ex_11_Actions_Advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions_file_upload {
    EdgeDriver driver;

    @BeforeTest
            public void test_file()

    {
        EdgeOptions edgeoptions = new EdgeOptions();
        edgeoptions.addArguments("--window-size=800,600");
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        driver = new EdgeDriver(edgeoptions);
    }
    @Test
    public void test_file_2() throws InterruptedException {
        driver.get("https://awesomeqa.com/selenium/upload.html");
        WebElement insert = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        System.out.println(working_dir);

        insert.sendKeys(working_dir + "/src/test/java/org/khushimasur/ex_11_Actions_Advance/Testdata.txt");

        //path of upload file
        driver.findElement(By.name("submit")).click();
    }

        @AfterTest
        public void closeBrowser() {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }



}
