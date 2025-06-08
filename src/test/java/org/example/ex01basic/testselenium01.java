package org.example.ex01basic;
import io.qameta.allure.Description;
import org.testng.annotations.Test;


import org.openqa.selenium.firefox.FirefoxDriver;

public class testselenium01 {
    @Description("open URL and print the title")
    @Test
    public void selenium01(){
        //open URL and print the title
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());
    }
}
