package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_Login {
    WebDriver driver;

    public P02_Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id ="Email")
    public WebElement emailText;

    @FindBy(id = "Password")
    public WebElement passwordText;

    @FindBy(xpath = "//button[@class='button-1 login-button']")
    public WebElement loginButton;

    public By userTab(){
        return By.className("ico-account");
    }
}
