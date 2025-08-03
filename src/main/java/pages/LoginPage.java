package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    WebDriver driver;

    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginButton = By.className("orangehrm-login-button");
    private By dashboardHeader = By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span");
    
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterUsername(String username){
        driver.findElement(usernameInput);
    }

    public void enterPassword(String password){
        driver.findElement(passwordInput);
    }

    public void clickLoginButton(){
        driver.findElement(loginButton).click();
    }

    public String dashboardText(){
        String headerText = driver.findElement(dashboardHeader).getText();
        return headerText;
    }
}