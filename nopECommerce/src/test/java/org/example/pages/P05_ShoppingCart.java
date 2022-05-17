package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P05_ShoppingCart {
    WebDriver driver;

    public P05_ShoppingCart(WebDriver driver) {
        this.driver = driver;
    }

    public By cartElements(){
        return By.cssSelector("td[class=\"sku\"]");
    }
}
