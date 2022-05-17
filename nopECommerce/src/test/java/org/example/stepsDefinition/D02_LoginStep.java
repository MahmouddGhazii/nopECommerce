package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.example.pages.P02_Login;
import org.example.pages.P03_HomePage;

public class D02_LoginStep {

    WebDriver driver = Hooks.driver;
    P02_Login register = new P02_Login(Hooks.driver);
    P03_HomePage HomePageRegister = new P03_HomePage(Hooks.driver);

    @When("user click on \"Log in\" tab")
    public void loginTabClick(){
        driver.findElement(HomePageRegister.loginButton()).click();
    }

    @Then("user should be directed to login page")
    public void loginPageDirecting(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/login?returnUrl=%2F");
    }

    @When("^user enter \"(.*)\" and \"(.*)\"$")
    public void enterEmail(String email, String password){
        register.emailText.sendKeys(email);
        register.passwordText.sendKeys(password);
    }

    @And("clicks on LOG IN button")
    public void loginCBtnClick(){
        register.loginButton.click();
    }

    @Then("user should be logged in successfully")
    public void successfulLogin(){
        SoftAssert softAssertion = new SoftAssert();
        softAssertion.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        softAssertion.assertTrue(driver.findElement(register.userTab()).isDisplayed());
        softAssertion.assertAll();
    }


}
