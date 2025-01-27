package org.khushimasur.ex_07_Selenium_Webtables;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium21 {
    @Description("webtables")
    @Test
    public void test_find() throws Exception{
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Khushi\\Downloads\\edgedriver_win64\\msedgedriver.exe");


        WebDriver driver=new EdgeDriver();
        driver.get("https://awesomeqa.com/webtable.html");
        String first_part = "//table[@id=\"customers\"]/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";


        int row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        int col= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();
        //the above does not print anythin, it just interact with table
        for(int i=2;i<=row;i++){
            for(int j=1;j<=col;j++){
                String dynamic_path=first_part+i+second_part+j+third_part;
                System.out.println(dynamic_path);
                //the above will give the paths like //table[@id="customers"]/tbody/tr[2]/td[1]
                String data=driver.findElement(By.xpath(dynamic_path)).getText();
                System.out.println(data);
                //the above will give data as well

               if(data.contains("Helen Bennett")) {
                    String country_path = dynamic_path + "/following-sibling::td";
                   String country_text = driver.findElement(By.xpath(dynamic_path)).getText();
                    System.out.println("country_text");
                }


            }
        }




        Thread.sleep(5000);
        driver.quit();



    }
    ////img[@title="Flipkart"]
}
