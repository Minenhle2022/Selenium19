package Class6;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/javascript-alert-box-demo.php");
        WebElement button1=driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        button1.click();

        //to observe
        Thread.sleep(2000);
        //switch the focus of the driver to alert
        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        WebElement button2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        button2.click();
        Thread.sleep(2000);
        //switch the focus of the driver to alert
        alert1.dismiss();

        WebElement button3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        button3.click();
        Thread.sleep(2000);
        alert1.sendKeys("Minnenhle");
        alert1.accept();




    }
}
