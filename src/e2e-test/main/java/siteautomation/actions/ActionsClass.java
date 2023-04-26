package siteautomation.actions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import siteautomation.locators.Locators;
import siteautomation.utils.ConstantUtils;

import java.util.concurrent.TimeUnit;

public class ActionsClass {
    private Locators locators;
    private WebDriver driver;


    public ActionsClass(WebDriver driver) {
        this.driver = driver;
        this.locators = PageFactory.initElements(driver, Locators.class);
    }

    public void find_Login() {
        locators.findlogin.click();
    }


    public void set_Username(String usern) {
        locators.username.sendKeys(usern);
    }

    public void set_Password(String pass) {
        locators.password.sendKeys(pass);
    }

    public void click_Button() {
        locators.button.click();
    }

    public void set_Comment(String comm) {
        locators.comment.sendKeys(comm);
    }

    public void find_Sequence() {
        locators.findsequence.click();
    }

    public void find_Blog() {
        locators.findblogs.click();
    }

    public void Select_Plugin() {
        locators.selectplugin.click();
    }

    public WebElement Hover_Element() {
        WebElement ele = locators.hoverelement;
        return ele;
    }


    public void Properties_button() {
        locators.propertiesbutton.click();
    }

    public void selectFilePlugin(String pluginName) {
        locators.locatePluginName(pluginName).click();

    }

    public void elementDetails(String pluginProperty, String value) {
        WebElement element = locators.AddElementDetails(pluginProperty);
        element.sendKeys(value);
    }

    public void locateProperty(String pluginProperty, String option) {
        locators.locatePropertyElement(pluginProperty).click();
        locators.locateDropdownListItem(option).click();
    }

    public  void verifyRequiredPropertyHasNoValueErrorMessage(String propertyName) {
        String expectedErrorMessage = ConstantUtils.ERROR_MSG.replaceAll("PROPERTY", propertyName);
        verifyPluginPropertyInlineErrorMessage(propertyName, expectedErrorMessage);
    }

    private void verifyPluginPropertyInlineErrorMessage(String propertyName, String expectedErrorMessage) {
         driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
         WebElement element=locators.locatePluginPropertyInlineError(propertyName);
        Assert.assertTrue(element.isDisplayed());
        String actualmessage=element.getText();
        Assert.assertTrue(actualmessage.contains(expectedErrorMessage));
    }


    public void Validate_Button() {
        locators.validatebutton.click();
    }

    public void Wait() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}



