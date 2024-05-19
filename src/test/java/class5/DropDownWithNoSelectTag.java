package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownWithNoSelectTag {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php");

        WebElement DD= driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
        DD.click();
// find all Options
        List<WebElement> sel=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
        for (WebElement sels:sel) {
            String value = sels.getText();
            if (value.equals("Greece")) {
                sels.click();
                break;

            }
        }

    }
}
