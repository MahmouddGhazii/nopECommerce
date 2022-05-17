package org.example.stepsDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_FollowUsStep {
    WebDriver driver = Hooks.driver;
    P03_HomePage HomePageRegister = new P03_HomePage(Hooks.driver);

    @When("user clicks on facebook link")
    public void userClicksOnFacebookLink(){
        driver.findElement(HomePageRegister.faceBookLink()).click();
    }

    @When("user clicks on twitter link")
    public void userClicksOnTwitterLink() {
        driver.findElement(HomePageRegister.twitterLink()).click();
    }

    @When("user clicks on rss link")
    public void userClicksOnRssLink() {
        driver.findElement(HomePageRegister.rssLink()).click();

    }

    @When("user clicks on youtube link")
    public void userClicksOnYoutubeLink() {
        driver.findElement(HomePageRegister.youtubeLink()).click();

    }

    @Then("^\"([^\"]*)\" is opened in a new tab$")
    public void theSocialPlatformTab(String url) {
        ArrayList<String> Tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(Tabs.get(1));
        Assert.assertTrue(driver.getCurrentUrl().contains(url));
        driver.switchTo().window(Tabs.get(0));
    }
}
