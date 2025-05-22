package com.ait.qa55;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;

public class HomeworkTestFirstSeleniumTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
    }

    @Test
    public void openDemoWebShop() {
        System.out.println("Open page DemoWebshop");
    }

    @AfterMethod (enabled = false)
    public void tearDown() {
        System.out.println("Close the page DemoWebshop");
        driver.quit();
    }
}
