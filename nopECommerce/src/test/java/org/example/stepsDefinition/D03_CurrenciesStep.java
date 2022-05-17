package org.example.stepsDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_CurrenciesStep {
    WebDriver driver = Hooks.driver;
    P03_HomePage HomePageRegister = new P03_HomePage(Hooks.driver);

    @When("user click on currency field and choose Euro")
    public void currencyChanging() throws InterruptedException {
        WebElement selectElement = HomePageRegister.currencyField;
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText("Euro");
    }

    @Then("the currency changes to Euro")
    public void checkCurrency(){
        WebElement selectedElement = HomePageRegister.currencyField;
        Select selectedObject = new Select(selectedElement);
        Assert.assertEquals(selectedObject.getFirstSelectedOption().getText(),"Euro");
    }
}
