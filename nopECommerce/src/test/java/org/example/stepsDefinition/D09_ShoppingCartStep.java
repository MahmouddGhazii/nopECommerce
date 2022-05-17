package org.example.stepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.example.pages.P05_ShoppingCart;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class D09_ShoppingCartStep {
    WebDriver driver = Hooks.driver;
    P03_HomePage HomePageRegister = new P03_HomePage(Hooks.driver);
    P05_ShoppingCart register = new P05_ShoppingCart(Hooks.driver);

    @When("user add product to cart")
    public void addToCart() throws InterruptedException {
        driver.findElements(HomePageRegister.addToCartButton()).get(2).click();
        Thread.sleep(2000);
    }

    @Then("cart notification success is visible")
    public void cartNotificationSuccessIsVisible() {
        Assert.assertTrue(driver.findElement(HomePageRegister.addToCartSuccesMessage()).isDisplayed());
    }

    @And("the cart page is updated")
    public void theCartPageIsUpdated() throws InterruptedException {
        driver.findElements(HomePageRegister.successMessageGoToShoppingCart()).get(0).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/cart");
        System.out.println(driver.findElements(register.cartElements()).size());
    }
}
