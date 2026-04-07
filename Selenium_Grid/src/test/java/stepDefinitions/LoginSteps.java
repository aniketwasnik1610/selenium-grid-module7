package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginSteps {

    WebDriver driver;
    LoginPage loginPage;

    @Given("user opens the browser")
    public void openBrowser() {
        driver = DriverFactory.initDriver();
        loginPage = new LoginPage(driver);
    }

    @When("user navigates to {string}")
    public void navigateTo(String url) {
        driver.get(url);
    }

    @And("user enters username {string}")
    public void enterUsername(String user) {
        loginPage.enterUsername(user);
    }

    @And("user enters password {string}")
    public void enterPassword(String pass) {
        loginPage.enterPassword(pass);
    }

    @And("user clicks login button")
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @Then("login should be successful")
    public void loginSuccess() {
        System.out.println("Login test executed");
    }
}