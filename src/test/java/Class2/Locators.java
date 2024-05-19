package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
go to fb.com
send your username
send your password
click on login button

 */

public class Locators {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://syntaxprojects.com/");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("minenhle@gmail.com");
        WebElement password = driver.findElement(By.name("pass"));
        password.sendKeys("minenhle@123");
        //driver.findElement(By.)
        WebElement LoginButton = driver.findElement(By.name("login"));
      //  LoginButton.click();

        /*
        go to facebook and create new account
         */

        WebElement createAccount = driver.findElement(By.linkText("Create new account"));
        createAccount.click();

    }
}
