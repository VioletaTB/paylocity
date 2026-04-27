package ui.test;

import page.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.jfr.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    @Description("This test case open Paylocity page")
    public void setUp(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://wmxrwq14uc.execute-api.us-east-1.amazonaws.com/Prod/Account/Login");

    }

   /* @AfterMethod
    @Description("Close page")
    public void tearDown() {
            driver.quit();
    }*/
}
