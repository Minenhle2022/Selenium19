package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-select-dropdown-demo.php");

        //find the element with the select tag

       WebElement DD= driver.findElement(By.xpath("//select[@id='select-demo']"));
        //select class and pass the parameter
        Select sel = new Select(DD);
        sel.selectByIndex(4);

        Thread.sleep(2000);

        sel.selectByValue("Sunday");

        Thread.sleep(2000);
        //select by visible text
        sel.selectByVisibleText("Thursday");

        Thread.sleep(2000);

        WebElement multiSel=driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select sels =new Select(multiSel);
        sels.selectByValue("New Jersey");
        sels.selectByIndex(3);
        sels.selectByVisibleText("Pennsylvania");

        //options in Multiselect
        sels.deselectByIndex(3);

        System.out.println("the dropdown2 is multiselect" +sel.isMultiple());
        System.out.println("the dropdown1 is multiselect" +sels.isMultiple());

    }
}
