package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //Localizadores
    private By usernameField = By.id("Username");
    private By passwordField = By.id("Password");
    private By loginButton = By.cssSelector(".btn.btn-primary");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setUsername(String username){
        typeText(username,usernameField);
    }

    public void setPassword(String password){
        typeText(password,passwordField);
    }

    public void clickLoginButton(){
        click(loginButton);
    }

    public void login(String username, String password){
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }
}
