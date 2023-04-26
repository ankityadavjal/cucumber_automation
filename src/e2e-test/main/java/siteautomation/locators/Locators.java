package siteautomation.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locators {
    private WebDriver driver;

    public Locators(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



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

    @FindBy(css = "a[title='Share a Blog']")
    public WebElement findblogs;

    @FindBy(linkText = "What Is Sequence In SQL? Why Sequence?")
    public WebElement findsequence;

    @FindBy(xpath = "//*[@data-cy='plugin-File-batchsource']")
    public WebElement selectplugin;

    @FindBy(css = "div.node")
    public WebElement hoverelement;

    @FindBy(xpath = "//*[@data-cy='node-properties-btn']")
    public WebElement propertiesbutton;


    public WebElement AddElementDetails(String pluginProperty) {
       String xpath = "//input[@data-cy='"+pluginProperty+"']";
       return driver.findElement(By.xpath(xpath));
    }

    public WebElement Errors(String fieldname) {
        String value="Required property '"+fieldname+"' has no value.";
        return driver.findElement(By.linkText(value));
    }

    public WebElement locatePluginName(String pluginName) {
        String xpath = "//*[@data-cy='plugin-"+pluginName+"-batchsource']";
        return driver.findElement(By.xpath(xpath));
    }

    public  WebElement locatePropertyElement(String pluginProperty) {
        return driver.findElement(By.xpath("//*[@data-cy='" + pluginProperty + "']"));
    }

    public  WebElement locateDropdownListItem(String option) {
        return driver.findElement(By.xpath("//li[@data-value='" + option + "']"));
    }
    public  WebElement locatePluginPropertyInlineError(String propertyName) {
        return driver.findElement(
                By.xpath("//*[@data-cy='" + propertyName + "']/following-sibling::div[@data-cy='property-row-error']"));
    }




    @FindBy(xpath = "//*[@data-cy='plugin-properties-validate-btn']")
    public WebElement validatebutton;


}