package siteautomation.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {
    private WebDriver driver;

    @FindBy(className = "login-btn")
    public WebElement findlogin;


    @FindBy(id = "TextBoxUserId")
    public WebElement username;

    @FindBy(id = "TextBoxPassword")
    public WebElement password;


    @FindBy(xpath = "//*[@id=\"ctl00_ContentMain_ButtonSignIN\"]")
    public WebElement button;

    @FindBy(css = "textarea[placeholder='Type your comment here and press Enter Key (Minimum 10 characters)']")
    public WebElement comment;

    @FindBy(xpath = "//a[@href=\"https://www.c-sharpcorner.com/blogs/what-is-sequence-in-sql-why-sequence\"]")
    public WebElement findsequence;

    @FindBy(xpath = "//a[@href=\"https://www.c-sharpcorner.com/blogs\"]")
    public WebElement findblogs;
///sdfsdfdsfds

}