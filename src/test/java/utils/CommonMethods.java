package utils;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication() throws IOException, InterruptedException {

        switch (ConfigReader.read("browser")){
            case "Chrome":
                driver=new ChromeDriver();
                break;
            case "FireFox":
                driver=new FirefoxDriver();
                break;
            case "Edge":
                driver=new EdgeDriver();
                break;
            default:
               throw new RuntimeException("invalid Browser Name");

        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.read("url"));

       WebElement userNames= driver.findElement(By.xpath("//input[@name='txtUsername']"));
       userNames.sendKeys(ConfigReader.read("userName"));
        WebElement pass= driver.findElement(By.xpath("//input[@name='txtPassword']"));
        pass.sendKeys(ConfigReader.read("password"));
        WebElement btn = driver.findElement(By.xpath("//input[@name='Submit']"));
        btn.click();
      Thread.sleep(3000);
      driver.close();
    }
}
