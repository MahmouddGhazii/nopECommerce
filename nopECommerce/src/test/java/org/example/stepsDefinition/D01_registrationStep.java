package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.example.pages.P01_Register;
import org.example.pages.P03_HomePage;


public class D01_registrationStep {

    WebDriver driver = Hooks.driver;
    P01_Register register = new P01_Register(Hooks.driver);
    P03_HomePage HomePageRegister = new P03_HomePage(Hooks.driver);


    @When("guest user clicks on Register Tab")
    public void registerTabClick(){
        driver.findElement(HomePageRegister.registerButton()).click();
    }

    @Then("guest user should be directed to registering page")
    public void guestDirecting(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/register?returnUrl=%2F");
    }

    @When("guest user chooses any Gender option")
    public void choosingGender(){
        driver.findElement(register.genderRadio()).click();
    }

    @And("Fill First Name")
    public void firstName(){
        driver.findElement(register.firstNameText()).sendKeys("Mahmoud");
    }

    @And("Fill Last Name")
    public void lastName(){
        driver.findElement(register.lastNameText()).sendKeys("ElGhazy");
    }

    @And("Select Day")
    public void dayOfBirth(){
        WebElement selectElement = register.dayOfBirthList;
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("2");
    }

    @And("Select Month")
    public void monthOfBirth(){
        WebElement selectElement = register.monthOfBirthList;
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("11");
    }

    @And("Select Year")
    public void yearOfBirth(){
        WebElement selectElement = register.yearOfBirthList;
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("1997");
    }

    @And("Enter any email")
    public void enterEmail(){
        register.emailText.sendKeys("MahmoudGalal.ElGhazy@gmail.com");
    }

    @And("Enter any company name")
    public void enterCompanyName(){
        register.companyNameText.sendKeys("Professional Test Track");
    }

    @And("Enter any password")
    public void enterPassword(){
        register.passwordText.sendKeys("Dduudd0@");
    }

    @And("Enter same password in Confirm Password field")
    public void reEnterPassword(){
        register.confirmPassword.sendKeys("Dduudd0@");
    }

    @And("Click on REGISTER button")
    public void clickRegister(){
        register.registerationButton.click();
    }

    @And("the user should be registered successfully")
    public void successRegistration(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
    }

    @And("a success green message is displayed")
    public void message() throws InterruptedException {
        Thread.sleep(3000);
        String expectedResult = "Your registration completed";
        String actualResult = register.registrationMessage.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
