package com.studentbeans.base;

import com.studentbeans.config.PropLoader;
import org.openqa.selenium.WebDriver;
import com.studentbeans.pageObjects.HomePage;

import java.time.Duration;
import java.util.Properties;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class PagesBase {
    public static WebDriver driver;
    public static Properties prop;
    public static HomePage homePage;

    @BeforeAll
    public static void driverSetup() {
        driver = DriverFactory.driver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        prop = PropLoader.loadProps("src/test/java/data.properties");
        homePage = new HomePage(driver);
    }

    @AfterAll
    public static void tearDown() {
//    driver.quit();
    }
}
