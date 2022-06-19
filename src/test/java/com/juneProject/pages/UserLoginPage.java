package com.juneProject.pages;

import com.juneProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage {
    public UserLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='user']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement submitForm;

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement expandMenu;

    @FindBy(xpath = "//li[@data-id='logout']")
    public WebElement logOut;


}
