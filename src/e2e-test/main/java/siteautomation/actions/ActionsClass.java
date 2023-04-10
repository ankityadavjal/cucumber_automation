package siteautomation.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import siteautomation.locators.Locators;

public class ActionsClass {
    private Locators locators;
    private WebDriver driver;


    public ActionsClass(WebDriver driver) {
        this.driver = driver;
        this.locators = PageFactory.initElements(driver, Locators.class);
    }

    public void find_login() {
        locators.findlogin.click();
    }

    public void set_Username(String usern) {
        locators.username.sendKeys(usern);
    }

    public void set_Password(String pass) {
        locators.password.sendKeys(pass);
    }

    public void click_button() {
        locators.button.click();
    }

    public void set_Comment(String comm) {
        locators.comment.sendKeys(comm);
    }

    public void find_sequence() {
        locators.findsequence.click();
    }

    public void find_blog() {
        locators.findblogs.click();
    }
}



