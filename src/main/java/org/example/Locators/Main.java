package org.example.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver1","C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.c-sharpcorner.com/");
//        //Navigating to URL
//        driver.manage().window().maximize();
//        //Maximizing Browser Window
//       // System.out.println("Successfully Opened the website");
//        Login login=new Login(driver);
//        login.find_login();
//        login.set_Username("ankityadavjal2726@gmail.com");
//        login.set_Password("ankit123");
//        login.click_button();

//
//
//        Blogs blog=new Blogs(driver);
//        blog.find_blogs();
//
//        Sequence sequence=new Sequence(driver);
//        sequence.find_sequence();
//
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        Comments comments=new Comments(driver);
//        comments.set_Comment("hello my name is jeff \ue007");

      //  driver.findElement(By.className("login-btn")).click();
        //Locating Login WebElement by ID and clicking it using click() method

      //  String Username="ankityadavjal2726@gmail.com";
      //  String Password="ankit123";
      //  String Comments="Hello my name is ankit and I am doing automation. \ue007";
      //  driver.findElement(By.id("TextBoxUserId")).sendKeys(Username);
        //Locating Username Text Box and Filling UserID
       // driver.findElement(By.id("TextBoxPassword")).sendKeys(Password);
        //Locating Username Text Box and Filling User Password
      //  driver.findElement(By.xpath("//*[@id=\"ctl00_ContentMain_ButtonSignIN\"]")).click();
//        System.out.println("Successfully login");
//        driver.findElement(By.xpath("//a[@href=\"https://www.c-sharpcorner.com/blogs\"]")).click();
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("//a[@href=\"https://www.c-sharpcorner.com/blogs/what-is-sequence-in-sql-why-sequence\"]")).click();
//        System.out.println("successfully entered blogs and in sequence ");
//        //  driver.findElement(By.cssSelector("textarea#InputCommentText_0"));
//        //  driver.findElement(By.cssSelector("textarea.form-control mention"));
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//        driver.findElement(By.cssSelector("textarea[placeholder='Type your comment here and press Enter Key (Minimum 10 characters)']")).sendKeys(Comments);
//        //.sendkeys(Keys.ENTER)
//        System.out.println("successfully go on comments and post comment");
//
//        //  driver.quit();
    }
}