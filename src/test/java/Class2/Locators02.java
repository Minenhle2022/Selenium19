package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.navigate().to("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.name("ctl00$MainContent$username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        WebElement login = driver.findElement(By.className("button"));
        login.click();
        Thread.sleep(4000);
       // WebElement logout = driver.findElement(By.linkText("Logout"));
       // Thread.sleep(4000);
       // logout.click();
       // driver.close();
        WebElement textTitle = driver.findElement(By.className("login_info"));
        String text=textTitle.getText();
        System.out.println("The text is "+ text);

        // get a title of the webPage

        String title = driver.getTitle();
        System.out.println("Title for a webPage is "+title);
        if (title.equals("Web Orders")) {
            System.out.println("You are logged in");
        }else {
            System.out.println("You haven't logged in");
        }

    }
}
