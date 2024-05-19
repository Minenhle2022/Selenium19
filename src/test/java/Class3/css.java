package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");

        WebElement inputBox = driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("Mini");

        WebElement profileBox = driver.findElement(By.cssSelector("input#profileBox"));
        profileBox.sendKeys("MiniSikhakah");

        WebElement feedback = driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedback.sendKeys("MiniSikhakah gihgghgsx");

        WebElement topic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        topic.sendKeys("MiniSikhakah gihgghgsx khskdhsd");

        WebElement IntroAd = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        IntroAd.sendKeys("selenium");

        WebElement Conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        Conclusion.sendKeys("seleniumJava");

        Thread.sleep(4500);
        driver.close();


    }
}
