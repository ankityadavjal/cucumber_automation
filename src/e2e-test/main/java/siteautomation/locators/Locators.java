package org.example.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 public class Locators {


     @FindBy(className = "login-btn")
     WebElement findlogin;

     @FindBy(id = "TextBoxUserId")
     WebElement username;

     @FindBy(id = "TextBoxPassword")
     WebElement password;


     @FindBy(xpath = "//*[@id=\"ctl00_ContentMain_ButtonSignIN\"]")
     WebElement button;

//    public Login(WebDriver driver) {
//        PageFactory.initElements(driver,this);
//    }
//
//
//    public void find_login()
//    {
//        findlogin.click();
//    }
//    public void set_Username(String usern)
//    {
//        username.sendKeys(usern);
//    }
//
//    public void set_Password(String pass)
//    {
//        password.sendKeys(pass);
//    }
//
//    public void click_button()
//    {
//        button.click();
//    }


     //class Comments {

     @FindBy(css = "textarea[placeholder='Type your comment here and press Enter Key (Minimum 10 characters)']")
     WebElement comment;

//    public Comments(WebDriver driver) {
//        PageFactory.initElements(driver, this);
//    }
//
//    public void set_Comment(String comm) {
//        comment.sendKeys(comm);
//    }
//}
//class Sequence {

     @FindBy(xpath = "//a[@href=\"https://www.c-sharpcorner.com/blogs/what-is-sequence-in-sql-why-sequence\"]")
     WebElement findsequence;
//
//    public Sequence(WebDriver driver) {
//        PageFactory.initElements(driver,this);
//    }
//
//    public void find_sequence()
//    {
//        findsequence.click();
//    }
//}
//

//class Blogs{

     @FindBy(xpath = "//a[@href=\"https://www.c-sharpcorner.com/blogs\"]")
     WebElement findblogs;


 }