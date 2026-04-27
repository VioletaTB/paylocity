package ui.test;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

import java.io.IOException;


public class LoginTest extends BaseTest {

    @Test(priority = 1)
    @Description("Login")
    public void testLogin() throws IOException {
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login("TestUser949","X3+}-|.5pPe/");

        WebElement buttonL =  driver.findElement(By.cssSelector(".btn.btn-primary"));
        Assert.assertNotNull(buttonL,"The element does not appears in the page");
    }

    @Test(priority = 2)
    @Description("Paylocity Benefits Dashboard validation")
    public void dashboardView() throws IOException{
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("TestUser949","X3+}-|.5pPe/");

        String expectedTitle = "Paylocity Benefits Dashboard";
        String originalTitle = driver.getTitle();
        Assert.assertTrue(originalTitle.contains(expectedTitle),"The element does not appears in the page");

    }



}
