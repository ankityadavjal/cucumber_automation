package siteautomation.stepdesign;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import siteautomation.actions.ActionsClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class MyStepdefs {
    private WebDriver driver;
    private ActionsClass actionsClass;


    @Given("Open up chrome and launch application")
    public void openUpChromeAndLaunchApplication() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");

        driver = new ChromeDriver();
        actionsClass = new ActionsClass(driver);
        driver.get("https://www.c-sharpcorner.com/");
        //System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        actionsClass.find_Login();


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
        actionsClass.find_Sequence();
    }


    @Then("The user writes his comment and enter")
    public void theUserWritesHisCommentAndEnter() {

        //driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("textarea[placeholder='Type your comment here and press Enter Key (Minimum 10 characters)']")));
        actionsClass.set_Comment("hello my name is aman \ue007");
    }
}
