package siteautomation.stepdesign;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import siteautomation.actions.ActionsClass;
import siteautomation.locators.Locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class MyStepdefs {
    private WebDriver driver;
    private ActionsClass actionsClass;
    private Locators locators;


    @Given("Open up chrome and launch application")
    public void openUpChromeAndLaunchApplication() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//        actionsClass = new ActionsClass(driver);
//        driver.get("https://www.c-sharpcorner.com/");
//        //System.out.println(driver.getTitle());
//        driver.manage().window().maximize();
//        actionsClass.find_Login();


    }

    @When("Enter the valid username and password")
    public void enterTheValidUsernameAndPassword() {
        actionsClass.set_Username("ankityadavjal2627@gmail.com");
        actionsClass.set_Password("ankit123");

    }

    @And("User successfully logged in")
    public void userSuccessfullyLoggedIn() {
        actionsClass.click_Button();
    }


    @When("The user clicks on blogs button")
    public void theUserClicksOnBlogsButton() {
        actionsClass.find_Blog();
    }


    @When("The user clicks on sequence link")
    public void theUserClicksOnSequenceLink() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        actionsClass.find_Sequence();
    }


    @Then("The user writes his comment and enter")
    public void theUserWritesHisCommentAndEnter() {
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        actionsClass.set_Comment("hello my name is aman \ue007");
    }

    @Given("Open up chrome and launch")
    public void openUpChromeAndLaunch() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        actionsClass = new ActionsClass(driver);
        driver.get("http://localhost:32769/pipelines/ns/default/studio");
    }


    @When("User clicks on properties")
    public void userClicksOnProperties() {
        actionsClass.Wait();
        Actions action = new Actions(driver);
        action.moveToElement(actionsClass.Hover_Element()).perform();
        actionsClass.Properties_button();
    }

    @And("Enter input plugin property: {string} with value: {string}")
    public void enterInputPluginPropertyWithValue(String pluginProperty, String value) {
        actionsClass.Wait();
        actionsClass.elementDetails(pluginProperty, value);
    }

    @And("User click on validate button")
    public void UserClickOnValidateButton() {
        actionsClass.Wait();
        actionsClass.Validate_Button();

    }


    @And("Select dropdown plugin property: {string} with option value: {string}")
    public void selectDropdownPluginPropertyWithOptionValue(String pluginProperty, String option) {
        actionsClass.Wait();
        actionsClass.locateProperty(pluginProperty, option);
    }

    @When("User select a plugin:{string} from the plugins")
    public void userSelectAPluginFromThePlugins(String pluginName) {
        actionsClass.Wait();
        actionsClass.selectFilePlugin(pluginName);
    }

    @Then("Validate mandatory property error for:{string}")
    public void validateMandatoryPropertyErrorFor(String pluginProperty) {
        actionsClass.Wait();
        actionsClass.verifyRequiredPropertyHasNoValueErrorMessage(pluginProperty);
    }
}
