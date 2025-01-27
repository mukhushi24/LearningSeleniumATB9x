package org.khushimasur.ex_15_DataDrivenTesting;

import org.testng.annotations.Test;

public class DataDrivenExcel {
    @Test(dataProvider="getData")
    public void loginTest(String email, String Password){
        System.out.println("Email- "+email);
        System.out.println("password- "+Password);



    }
}
