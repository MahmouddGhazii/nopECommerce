package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_HomePage {
    WebDriver driver;

    public P03_HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public By registerButton(){

        return By.cssSelector("a[href=\"/register?returnUrl=%2F\"]");
    }
    public By loginButton(){

        return By.cssSelector("a[href=\"/login?returnUrl=%2F\"]");
    }

    @FindBy(id = "customerCurrency")
    public WebElement currencyField;

    @FindBy(id = "small-searchterms")
    public WebElement searchField;

    @FindBy(xpath = "//button[@class='button-1 search-box-button']")
    public WebElement searchButton;

    public By computersCategory(){
        return By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/computers\"]");
    }

    public By desktopsSubCategory(){
        return By.cssSelector("ul[class=\"top-menu notmobile\"] a[href=\"/desktops\"]");
    }

    @FindBy(xpath = "//div[@class='page-title']")
    public WebElement titleOfSelectedCategory;

    public By theSlider(String sliderNumber){
        return By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNumber+"]");
    }

    public By faceBookLink(){
        return By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]");
    }

    public By twitterLink(){
        return By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]");
    }

    public By youtubeLink(){
        return By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]");
    }

    public By rssLink(){
        return By.cssSelector("a[href=\"/news/rss/1\"]");
    }

    public By addToWishListButtons(){
        return By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");
    }

    public By addToCartButton(){
        return By.cssSelector("button[class=\"button-2 product-box-add-to-cart-button\"]");
    }

    public By addToWishListSuccesMessage(){
        return By.cssSelector("div[class=\"bar-notification success\"]");
    }

    public By wishListItemsNo(){
        return By.cssSelector("span[class=\"wishlist-qty\"]");
    }

    public By addToCartSuccesMessage(){
        return By.cssSelector("div[class=\"bar-notification success\"]");
    }

    public By successMessageGoToShoppingCart(){
        return By.cssSelector("a[href=\"/cart\"]");
    }
}
