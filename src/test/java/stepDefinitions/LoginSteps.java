package stepDefinitions;

import pages.LoginPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;


public class LoginSteps{
    WebDriver driver;
    LoginPage loginPage;

    @Given("user is on the test login page")
    public void user_is_on_the_login_page(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void users_enters_username_and_password(String username, String password){
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("clicks on login")
    public void clicks_on_login(){
        loginPage.clickLoginButton();
    }

    @Then("user should redirected to the dashboard page")
    public void user_should_redirected_to_the_dashboard_page(){
        String verifyText = loginPage.dashboardText();
        assertEquals(verifyText,"DashBoard");
        driver.quit();
    } 
}