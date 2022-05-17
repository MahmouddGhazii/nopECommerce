package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class D04_SearchingStep {
    WebDriver driver = Hooks.driver;
    P03_HomePage HomePageRegister = new P03_HomePage(Hooks.driver);

    @When("user clicks on search field")
    public void searchFieldClick(){
        HomePageRegister.searchField.click();
    }

    @And("^types \"(.*)\"$")
    public void typesItemName(String itemName){
        HomePageRegister.searchField.sendKeys(itemName);
    }

    @And("clicks on the search button")
    public void clickSearch(){
        HomePageRegister.searchButton.click();
    }

    @Then("the search results will appear")
    public void searchFeedback(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search"));
        softAssert.assertTrue(driver.findElements(By.xpath("//div[@class='item-box']")).size() > 0);
        softAssert.assertAll();
    }
}
