package org.example.stepsDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D06_HomeSlidersStep {

    WebDriver driver = Hooks.driver;
    P03_HomePage HomePageRegister = new P03_HomePage(Hooks.driver);

    @When("user click in first slider")
    public void firstSlider(){
        driver.findElement(HomePageRegister.theSlider("1")).click();
    }

    @Then("the relative product for first slider is displayed")
    public void firstSlideIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone_s6");
    }

    @When("user click in second slider")
    public void secondSlider(){
        driver.findElement(HomePageRegister.theSlider("2")).click();
    }

    @Then("the relative product for second slider is displayed")
    public void secondSlideIsDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia-lumia-1020");
    }
}
