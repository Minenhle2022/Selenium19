package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class radioButton {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-radiobutton-demo.php");

       WebElement maleDB = driver.findElement(By.xpath("//input[@value='Male' and @name='optradio']"));
       maleDB.click();

       //select from 3 option
      List<WebElement> radioButtons= driver.findElements(By.xpath("//input[@name='ageGroup']"));

        for (WebElement radioB:radioButtons) {
            String value = radioB.getAttribute("value");
            if (value.equals("0 - 5")) {
                radioB.click();
                break;
            }
        }

    }
}
