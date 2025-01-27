package org.khushimasur.ex_15_DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//DATA PROVIDER WORK IS TO INJECT VALUES IN @Test

public class TestDataDrivenTesting {
    //to fetch data you have two dimensional array to get the data
    @DataProvider(name="LoginData", parallel=true)
    public Object[][] getData() {
        return new Object[][]{new Object[]{"admin@gmail.com", "pass123"},
                new Object[]{"admin@gmail.com", "pass123"}

        };
    }




@Test(dataProvider="getData")
    public void loginTest(String email, String Password){
    System.out.println("Email- "+email);
    System.out.println("password- "+Password);



    }
}
