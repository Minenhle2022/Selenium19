package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://syntaxprojects.com/Xpath.php");

 //     to send the username in the text box
       WebElement username= driver.findElement(By.xpath("//input[@id='title']"));
       username.sendKeys("Minenhle");
 //    Click button

       WebElement button=driver.findElement(By.xpath("//button[text()='Click Here']"));
       button.click();

       WebElement security = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
       security.sendKeys("Batch19");

       WebElement label = driver.findElement(By.xpath("//label[contains(text(),'ipsum')]"));
        System.out.println(label.getText());


        WebElement apiSett = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSett.sendKeys("Sikhakhane");

        WebElement index = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        index.sendKeys("SAMKE");
/*

//input[@id='favourite-book']/following::input[2]
//input[@id='least-favorite']/preceding::input[2]
////div[@id='familyTree']/child::input[1]
 */

        WebElement datafield = driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        datafield.sendKeys("Tumelo");

        WebElement followInput = driver.findElement(By.xpath("//input[@id='favourite-book']/following::input[2]"));
        followInput.sendKeys("Azania");

       Thread.sleep(4100);

       driver.close();

    }
}
